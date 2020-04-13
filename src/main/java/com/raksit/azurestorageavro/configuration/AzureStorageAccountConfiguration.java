package com.raksit.azurestorageavro.configuration;

import com.microsoft.azure.storage.CloudStorageAccount;
import com.microsoft.azure.storage.StorageException;
import com.microsoft.azure.storage.blob.CloudBlobClient;
import com.microsoft.azure.storage.blob.CloudBlobContainer;
import java.net.URISyntaxException;
import java.security.InvalidKeyException;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AzureStorageAccountConfiguration {

  @Bean
  public CloudBlobClient cloudBlobClient() throws URISyntaxException, InvalidKeyException {
    CloudStorageAccount storageAccount = CloudStorageAccount.parse("<your-connection-string-here>");
    return storageAccount.createCloudBlobClient();
  }

  @Bean
  public CloudBlobContainer cloudBlobContainer() throws URISyntaxException, StorageException, InvalidKeyException {
    return cloudBlobClient().getContainerReference("<your-container-name-here>");
  }
}
