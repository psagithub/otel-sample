package com.otel.sample.controller.interfaces;

import reactor.core.publisher.Mono;

public interface OtelSampleController {

  Mono<?> home();
}
