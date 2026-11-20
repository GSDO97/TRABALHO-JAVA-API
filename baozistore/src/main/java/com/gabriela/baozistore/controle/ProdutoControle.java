package com.gabriela.baozistore.controle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.gabriela.baozistore.model.Produto;
import com.gabriela.baozistore.repositorio.ProdutoRepositorio;

@RestController
@RequestMapping("/produtos")
public class ProdutoControle {

    @Autowired
    private ProdutoRepositorio repositorio;

    @PostMapping
    public Produto criar(@RequestBody Produto produto) {
        return repositorio.save(produto);
    }

    @GetMapping
    public List<Produto> listar() {
        return repositorio.findAll();
    }

    @GetMapping("/{id}")
    public Produto buscarPorId(@PathVariable Long id) {
        return repositorio.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        repositorio.deleteById(id);
    }
}