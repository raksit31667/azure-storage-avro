package com.raksit.azurestorageavro.controller;

import Microsoft.ServiceBus.Messaging.EventData;
import com.microsoft.azure.storage.StorageException;
import com.microsoft.azure.storage.blob.CloudBlobContainer;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URISyntaxException;
import org.apache.avro.file.DataFileReader;
import org.apache.avro.io.DatumReader;
import org.apache.avro.specific.SpecificDatumReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventCaptureController {

  @Autowired
  private CloudBlobContainer cloudBlobContainer;

  @GetMapping
  public String deserialize() throws URISyntaxException, StorageException, IOException {
    File file = new File("file");
    BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(file));
    cloudBlobContainer.getBlockBlobReference("<your-avro-file-here>").download(outputStream);
    DatumReader<EventData> reader = new SpecificDatumReader<>(EventData.class);
    DataFileReader<EventData> dataFileReader = new DataFileReader<>(file, reader);
    EventData eventData;
    while (dataFileReader.hasNext()) {
      eventData = dataFileReader.next();
      System.out.println(eventData);
    }
    outputStream.close();
    file.delete();
    return null;
  }
}
