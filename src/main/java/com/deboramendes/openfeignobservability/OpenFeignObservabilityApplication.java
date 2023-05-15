package com.deboramendes.openfeignobservability;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class OpenFeignObservabilityApplication {

    public static void main(String[] args) {
        SpringApplication.run(OpenFeignObservabilityApplication.class, args);
    }

}
