package com.raksit.azurestorageavro.controller;

import com.microsoft.azure.storage.StorageException;
import com.microsoft.azure.storage.blob.CloudBlobContainer;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import org.apache.avro.Schema;
import org.apache.avro.generic.GenericDatumReader;
import org.apache.avro.generic.GenericDatumWriter;
import org.apache.avro.generic.GenericRecord;
import org.apache.avro.io.DatumWriter;
import org.apache.avro.io.Decoder;
import org.apache.avro.io.DecoderFactory;
import org.apache.avro.io.EncoderFactory;
import org.apache.avro.io.JsonEncoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventCaptureController {

  @Autowired
  private CloudBlobContainer cloudBlobContainer;

  @GetMapping
  public String deserialize() throws URISyntaxException, StorageException, IOException {
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    cloudBlobContainer.getBlockBlobReference("<your-avro-file-here>").download(outputStream);
    String schemaString = "{\n" +
        "\n" +
        "    \"type\":\"record\",\n" +
        "    \"name\":\"EventData\",\n" +
        "    \"namespace\":\"Microsoft.ServiceBus.Messaging\",\n" +
        "    \"fields\":[\n" +
        "                 {\"name\":\"SequenceNumber\",\"type\":\"long\"},\n" +
        "                 {\"name\":\"Offset\",\"type\":\"string\"},\n" +
        "                 {\"name\":\"EnqueuedTimeUtc\",\"type\":\"string\"},\n" +
        "                 {\"name\":\"SystemProperties\",\"type\":{\"type\":\"map\",\"values\":[\"long\",\"double\",\"string\",\"bytes\"]}},\n" +
        "                 {\"name\":\"Properties\",\"type\":{\"type\":\"map\",\"values\":[\"long\",\"double\",\"string\",\"bytes\"]}},\n" +
        "                 {\"name\":\"Body\",\"type\":[\"null\",\"bytes\"]}\n" +
        "             ]\n" +
        "}";
    Schema schema = new Schema.Parser().parse(schemaString);
    GenericDatumReader<GenericRecord> reader = new GenericDatumReader<>(schema);
    InputStream input = new ByteArrayInputStream(outputStream.toByteArray());
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    DatumWriter<GenericRecord> writer = new GenericDatumWriter<GenericRecord>(schema);
    JsonEncoder encoder = EncoderFactory.get().jsonEncoder(schema, output, false);
    Decoder decoder = DecoderFactory.get().binaryDecoder(input, null);
    GenericRecord datum;
    while (true) {
      try {
        datum = reader.read(null, decoder);
      } catch (EOFException eofe) {
        break;
      }
      writer.write(datum, encoder);
    }
    encoder.flush();
    output.flush();
    return new String(output.toByteArray());
  }
}
