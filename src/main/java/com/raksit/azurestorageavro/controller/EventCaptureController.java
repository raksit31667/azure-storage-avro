package com.raksit.azurestorageavro.controller;

import Microsoft.ServiceBus.Messaging.EventData;
import com.microsoft.azure.storage.StorageException;
import com.microsoft.azure.storage.blob.CloudBlobContainer;
import com.microsoft.azure.storage.blob.CloudBlockBlob;
import java.io.ByteArrayOutputStream;
import java.net.URISyntaxException;
import java.util.List;
import java.util.stream.Collectors;
import org.apache.avro.file.DataFileReader;
import org.apache.avro.file.FileReader;
import org.apache.avro.file.SeekableByteArrayInput;
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
  public List<String> deserialize() throws URISyntaxException, StorageException {
    return cloudBlobContainer.getDirectoryReference("<your-directory-here>")
        .listBlobsSegmented().getResults().stream()
        .map(blobItem -> (CloudBlockBlob) blobItem)
        .map(this::deserialize)
        .collect(Collectors.toList());
  }

  private String deserialize(CloudBlockBlob blockBlob) {
    try (ByteArrayOutputStream outputStream = new ByteArrayOutputStream()) {
      blockBlob.download(outputStream);
      DatumReader<EventData> reader = new SpecificDatumReader<>(EventData.class);
      try (FileReader<EventData> dataFileReader = DataFileReader.openReader(new SeekableByteArrayInput(outputStream.toByteArray()), reader)) {
        EventData eventData;
        while (dataFileReader.hasNext()) {
          eventData = dataFileReader.next();
          System.out.println(new String(eventData.getBody().array()));
        }
      }
    } catch (Exception e) {
      System.out.println("Deserialization error: " + e.getMessage());
    }
    return null;
  }
}
