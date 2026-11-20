package com.gabriela.baozistore.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabriela.baozistore.model.Pedido;

public interface PedidoRepositorio extends JpaRepository<Pedido, Long> {

}
