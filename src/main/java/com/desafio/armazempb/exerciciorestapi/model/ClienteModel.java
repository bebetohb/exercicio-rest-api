package com.desafio.armazempb.exerciciorestapi.model;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "cliente")
public class ClienteModel {

    @Id
    public Integer id;

    @Column(nullable = false, length = 50)
    public String nome;

    @Column(nullable = false, length = 12)
    public String cpf;

    @Column(nullable = false, length = 80)
    public String endereco;

    @Column(nullable = false)
    public Date data_nascimento;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Date getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(Date data_nascimento) {
        this.data_nascimento = data_nascimento;
    }
}