package com.example.demo.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class StoredIntServiceTest {

  private StoredIntService storedIntService = new StoredIntService();

  @Test
  public void read_or_create() {
    int record = storedIntService.apply();
    assertInstanceOf(Integer.class, record);
  }
}
