package com.carro.carro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carro.carro.entities.Carro;

public interface CarroRepository extends JpaRepository<Carro, Long>{
    
}
