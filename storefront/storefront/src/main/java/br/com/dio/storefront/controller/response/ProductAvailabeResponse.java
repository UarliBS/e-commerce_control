package br.com.dio.storefront.controller.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public record ProductAvailabeResponse(
        @JsonProperty("id")
        UUID id,
        @JsonProperty("name")
        String name
) {
}
