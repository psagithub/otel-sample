package com.otel.sample.metrics;

import io.opentelemetry.api.OpenTelemetry;
import io.opentelemetry.instrumentation.runtimemetrics.java17.RuntimeMetrics;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RuntimeMetricsConfig {

  private final OpenTelemetry openTelemetry;

  @Autowired
  public RuntimeMetricsConfig(OpenTelemetry openTelemetry) {
    this.openTelemetry = openTelemetry;
  }

  @Bean
  public RuntimeMetrics otelRuntimeMetrics() {
    // Java8+ common runtime metrics + Java17+ specific runtime metrics.
    return RuntimeMetrics.builder(openTelemetry).enableAllFeatures().build();
  }
}
