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
    // Retorna a lista de todas as cidades cadastradas no banco de dados.

    @GetMapping("/{id}")
    public Cidade buscarPorId(@PathVariable Integer id) {
        return cidadeRepository.findById(id).orElse(null);
    }
    // Busca e retorna uma cidade com base no ID informado na URL.
    // Se não for encontrada, retorna null.

    @PostMapping
    public Cidade criar(@RequestBody Cidade cidade) {
        return cidadeRepository.save(cidade);
    }
    // Cria uma nova cidade com os dados recebidos no corpo da requisição.
    // Retorna a cidade salva com o ID gerado.

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Integer id) {
        cidadeRepository.deleteById(id);
    }
    // Exclui a cidade com o ID informado na URL.
    // Se o ID não existir, pode lançar exceção.
}
