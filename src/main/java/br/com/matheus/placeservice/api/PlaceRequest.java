package br.com.matheus.placeservice.api;

import jakarta.validation.constraints.NotBlank;

import java.time.LocalDateTime;

public record PlaceRequest(
        @NotBlank String name,
        @NotBlank String state) {
}
