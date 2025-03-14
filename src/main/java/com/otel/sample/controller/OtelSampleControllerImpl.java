package com.otel.sample.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.otel.sample.Paths;
import com.otel.sample.controller.interfaces.OtelSampleController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class OtelSampleControllerImpl implements OtelSampleController {

  private final ObjectMapper mapper;

  @Autowired
  public OtelSampleControllerImpl(ObjectMapper mapper) {
    this.mapper = mapper;
  }

  @Override
  @GetMapping(value = Paths.OTEL_HOME)
  public Mono<?> home() {
    return Mono.just("Welcome to Otel Sample");
  }
}
