package com.carro.carro.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carro.carro.dtos.CarroResponse;
import com.carro.carro.mappers.CarroMapper;
import com.carro.carro.repositories.CarroRepository;

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
}
