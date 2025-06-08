package com.transportadora.apilogistica.controller;

import com.transportadora.apilogistica.model.Cidade;
import com.transportadora.apilogistica.repository.CidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cidades")
public class CidadeController {

    @Autowired
    private CidadeRepository cidadeRepository;

    @GetMapping
    public List<Cidade> listar() {
        return cidadeRepository.findAll();
    }

    @GetMapping("/{id}")
    public Cidade buscarPorId(@PathVariable Integer id) {
        return cidadeRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Cidade criar(@RequestBody Cidade cidade) {
        return cidadeRepository.save(cidade);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Integer id) {
        cidadeRepository.deleteById(id);
    }
}
