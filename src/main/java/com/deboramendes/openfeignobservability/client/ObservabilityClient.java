package com.deboramendes.openfeignobservability.client;

import com.deboramendes.openfeignobservability.dto.OpenFeignObservabilityRequestDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "ObservabilityClient", url = "${client.observability.uri}")
public interface ObservabilityClient {
    @PostMapping("/v1")
    void create(@RequestBody OpenFeignObservabilityRequestDTO openFeignObservabilityRequestDTO);
}
