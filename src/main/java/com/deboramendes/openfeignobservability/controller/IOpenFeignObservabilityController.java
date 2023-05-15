package com.deboramendes.openfeignobservability.controller;

import com.deboramendes.openfeignobservability.dto.OpenFeignObservabilityRequestDTO;

public interface IOpenFeignObservabilityController {
    void create(final OpenFeignObservabilityRequestDTO openFeignObservabilityRequestDTO);
}
