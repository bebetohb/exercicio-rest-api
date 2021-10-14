package com.desafio.armazempb.exerciciorestapi.controller;

import com.desafio.armazempb.exerciciorestapi.model.ClienteModel;
import com.desafio.armazempb.exerciciorestapi.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ClienteController {

    @Autowired
    private ClienteRepository repository;

     @GetMapping(path = "/api/cliente/{id}")
    public ResponseEntity consultar(@PathVariable("id") Integer id) {
        return repository.findById(id)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping(path = "/api/cliente/salvar")
    public ClienteModel save(@RequestBody ClienteModel cliente) {
        return repository.save(cliente);
    }

}
