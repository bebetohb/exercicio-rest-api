package com.desafio.armazempb.exerciciorestapi.model;

import org.springframework.data.annotation.Reference;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity(name = "pedidos")
public class PedidosModel {

    @Id
    public Integer id;

    @Reference
    @Column(nullable = false)
    public Integer id_cliente ;

    @Column(nullable = false, length = 50)
    public double valor_total;

    @Column(nullable = false)
    public Timestamp data_pedido;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Integer id_cliente) {
        this.id_cliente = id_cliente;
    }

    public double getValor_total() {
        return valor_total;
    }

    public void setValor_total(double valor_total) {
        this.valor_total = valor_total;
    }

    public Timestamp getData_pedido() {
        return data_pedido;
    }

    public void setData_pedido(Timestamp data_pedido) {
        this.data_pedido = data_pedido;
    }
}
