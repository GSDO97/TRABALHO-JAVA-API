package com.gabriela.baozistore.controle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.gabriela.baozistore.model.Pedido;
import com.gabriela.baozistore.repositorio.PedidoRepositorio;

@RestController
@RequestMapping("/pedidos")
public class PedidoControle {

    @Autowired
    private PedidoRepositorio repositorio;

    @PostMapping
    public Pedido criar(@RequestBody Pedido pedido) {
        return repositorio.save(pedido);
    }

    @GetMapping
    public List<Pedido> listar() {
        return repositorio.findAll();
    }

    @GetMapping("/{id}")
    public Pedido buscarPorId(@PathVariable Long id) {
        return repositorio.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        repositorio.deleteById(id);
    }
}
