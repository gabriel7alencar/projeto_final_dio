package br.com.dio.warehouse.dto;

import br.com.dio.warehouse.entity.StockStatus;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public record ProductStorefrontSaveDTO(
        @JsonProperty("id")
        UUID id,
        @JsonProperty("status")
        String name,
        @JsonProperty("active")
        Boolean active)

{
}
