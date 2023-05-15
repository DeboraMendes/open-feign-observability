package com.deboramendes.openfeignobservability.controller;

import com.deboramendes.openfeignobservability.client.ObservabilityClient;
import com.deboramendes.openfeignobservability.dto.OpenFeignObservabilityRequestDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("v1")
@RequiredArgsConstructor
public class OpenFeignObservabilityControllerImpl implements IOpenFeignObservabilityController {

    private final ObservabilityClient observabilityClient;

    @Override
    @PostMapping
    public void create(@RequestBody final OpenFeignObservabilityRequestDTO openFeignObservabilityRequestDTO) {
        log.info("POST [{}]", openFeignObservabilityRequestDTO.getMessage());
        observabilityClient.create(openFeignObservabilityRequestDTO);
    }
}
