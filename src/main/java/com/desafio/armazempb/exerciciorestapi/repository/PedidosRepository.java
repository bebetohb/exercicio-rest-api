package com.desafio.armazempb.exerciciorestapi.repository;

import com.desafio.armazempb.exerciciorestapi.model.PedidosModel;
import org.springframework.data.repository.CrudRepository;


public interface PedidosRepository extends CrudRepository<PedidosModel, Integer> {
}
