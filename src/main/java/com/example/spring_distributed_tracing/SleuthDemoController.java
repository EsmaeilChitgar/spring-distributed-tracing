package com.example.spring_distributed_tracing;

import io.micrometer.tracing.Span;
import io.micrometer.tracing.Tracer;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@Slf4j
public class SleuthDemoController {

    private final Tracer tracer;

    @GetMapping("/hello")
    public String hello() {
        Span currentSpan = tracer.currentSpan();
        String correlationId = currentSpan.context().traceId();
        log.info("Handling hello request with trace ID: {}", correlationId);
        return "Hello from distributed tracing demo using micrometer!";
    }
}
