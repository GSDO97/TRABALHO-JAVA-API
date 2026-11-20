package com.gabriela.baozistore.controle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.gabriela.baozistore.model.Cliente;
import com.gabriela.baozistore.repositorio.ClienteRepositorio;

@RestController
@RequestMapping("/clientes")
public class ClienteControle {

    @Autowired
    private ClienteRepositorio repositorio;

    @PostMapping
    public Cliente criar(@RequestBody Cliente cliente) {
        return repositorio.save(cliente);
    }

    @GetMapping
    public List<Cliente> listar() {
        return repositorio.findAll();
    }

    @GetMapping("/{id}")
    public Cliente buscarPorId(@PathVariable Long id) {
        return repositorio.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        repositorio.deleteById(id);
    }
}