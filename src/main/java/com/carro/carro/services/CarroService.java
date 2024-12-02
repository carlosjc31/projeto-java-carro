package com.carro.carro.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carro.carro.dtos.CarroRequest;
import com.carro.carro.dtos.CarroResponse;
import com.carro.carro.entities.Carro;
import com.carro.carro.mappers.CarroMapper;
import com.carro.carro.repositories.CarroRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class CarroService {
    @Autowired
    private CarroRepository repository;

    public List<CarroResponse> getAllCarros(){
        return repository.findAll()
                         .stream()
                         .map(c -> CarroMapper.toDTO(c))
                         .collect(Collectors.toList());
    }

    public CarroResponse getCarroById(Long id){
        Carro carro = repository.findById(id).orElseThrow(
            () -> new EntityNotFoundException("Carro não encontrado")
        );
        return CarroMapper.toDTO(carro);
    }

    public CarroResponse save(CarroRequest carro){
        Carro newCarro = repository.save(CarroMapper.toEntity(carro));
        return CarroMapper.toDTO(newCarro);
    }
    
}
