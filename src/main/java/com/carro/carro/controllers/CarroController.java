package com.carro.carro.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carro.carro.dtos.CarroResponse;
import com.carro.carro.services.CarroService;

@RestController
@RequestMapping("carros")
public class CarroController {
    
    @Autowired
    private CarroService service;

    @GetMapping
    public ResponseEntity<List<CarroResponse>> getCarros(){
        return ResponseEntity.ok(service.getAllCarros());
    }

    @GetMapping("{id}")
    public ResponseEntity<CarroResponse> getCarro(@PathVariable Long id){
        return ResponseEntity.ok(service.getCarroById(id));
    }
}
