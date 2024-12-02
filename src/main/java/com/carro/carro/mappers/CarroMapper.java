package com.carro.carro.mappers;

import com.carro.carro.dtos.CarroRequest;
import com.carro.carro.dtos.CarroResponse;
import com.carro.carro.entities.Carro;

public class CarroMapper {
    public static CarroResponse toDTO(Carro carro){
        return new CarroResponse(
            carro.getId(), 
            carro.getMarca(),
            carro.getModelo(), 
            carro.getAno(), 
            carro.getCor());
    }

    public static Carro toEntity(CarroRequest carroRequest){
        Carro carro = new Carro();

        carro.setMarca(carroRequest.marca());
        carro.setModelo(carroRequest.modelo());
        carro.setAno(carroRequest.ano());
        carro.setCor(carroRequest.cor());

        return carro;
    }
}
