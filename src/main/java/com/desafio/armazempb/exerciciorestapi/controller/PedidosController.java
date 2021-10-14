package com.desafio.armazempb.exerciciorestapi.controller;

import com.desafio.armazempb.exerciciorestapi.model.PedidosModel;
import com.desafio.armazempb.exerciciorestapi.repository.PedidosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class PedidosController {

    @Autowired
    private PedidosRepository repository;

    @GetMapping(path = "/api/pedidos/{id}")
    public ResponseEntity consultar(@PathVariable("id") Integer id) {
        return repository.findById(id)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping(path = "/api/pedidos/salvar")
    public PedidosModel save(@RequestBody PedidosModel pedidos) {
        return repository.save(pedidos);
    }

}
