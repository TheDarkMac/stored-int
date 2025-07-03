package com.example.demo.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;
import org.springframework.stereotype.Service;

@Service
public class StoredIntService {

  private static final String BASE_DIR = "/tmp";
  private static final String FILENAME = "stored-int.txt";

  public int apply() {
    try {
      Files.createDirectories(Paths.get(BASE_DIR));
      Path filePath = Paths.get(BASE_DIR, FILENAME);

      if (Files.exists(filePath)) {
        String content = Files.readString(filePath).trim();
        return Integer.parseInt(content);
      } else {
        int randomValue = new Random().nextInt(100);
        Files.writeString(filePath, String.valueOf(randomValue));
        return randomValue;
      }
    } catch (IOException | NumberFormatException e) {
      throw new RuntimeException("Error during the file creation: " + e.getMessage(), e);
    }
  }
}
