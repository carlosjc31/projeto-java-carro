package com.carro.carro.dtos;

public record CarroResponse(
    Long id,
    String marca,
    String modelo,
    int ano,
    String cor
) {
    
}
