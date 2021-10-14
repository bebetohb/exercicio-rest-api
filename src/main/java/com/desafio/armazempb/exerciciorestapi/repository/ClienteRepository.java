package com.desafio.armazempb.exerciciorestapi.repository;

import com.desafio.armazempb.exerciciorestapi.model.ClienteModel;
import org.springframework.data.repository.CrudRepository;

public interface ClienteRepository extends CrudRepository<ClienteModel , Integer> {

}