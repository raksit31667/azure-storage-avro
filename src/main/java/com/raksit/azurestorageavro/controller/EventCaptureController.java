package com.raksit.azurestorageavro.controller;

import com.microsoft.azure.storage.StorageException;
import com.microsoft.azure.storage.blob.CloudBlobContainer;
import java.io.ByteArrayOutputStream;
import java.net.URISyntaxException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventCaptureController {

  @Autowired
  private CloudBlobContainer cloudBlobContainer;

  @GetMapping
  public String deserialize() throws URISyntaxException, StorageException {
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    cloudBlobContainer.getBlockBlobReference("").download(outputStream);
    return outputStream.toString();
  }
}
