package com.gabriela.baozistore.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabriela.baozistore.model.Cliente;

public interface ClienteRepositorio extends JpaRepository<Cliente, Long> {
 

}