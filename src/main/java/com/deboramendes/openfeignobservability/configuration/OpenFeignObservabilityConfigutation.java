package com.deboramendes.openfeignobservability.configuration;

import feign.Capability;
import feign.micrometer.MicrometerCapability;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenFeignObservabilityConfigutation {
    /**
     * Responsável por manter o TraceId nas integrações utilizando OpenFeign.
     *
     * @param registry
     * @return
     */
    @Bean
    public Capability capability(final MeterRegistry registry) {
        return new MicrometerCapability(registry);
    }
}
