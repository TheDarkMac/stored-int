package com.example.demo.endpoint.rest.controller;

import com.example.demo.service.StoredIntService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/stored-int")
public class StoredIntController {

  private final StoredIntService storedIntService;

  @GetMapping()
  public int getStoredInt() {
    return storedIntService.apply();
  }
}
