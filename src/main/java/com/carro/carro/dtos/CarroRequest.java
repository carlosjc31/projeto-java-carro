package com.carro.carro.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record CarroRequest(
    
    @NotBlank(message = "O campo marca é obrigatório")
    @Size(min = 3, message = "O campo marca deve ter no mínimo 3 caracteres")
    String marca,
    
    @NotBlank(message = "O campo modelo é obrigatório")
    String modelo,
    
    @NotBlank(message = "O campo ano é obrigatório")
    int ano,

    @NotBlank(message = "O campo cor é obrigatório")
    String cor
) {
    
}
