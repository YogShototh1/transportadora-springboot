package com.transportadora.apilogistica.controller;

import com.transportadora.apilogistica.model.Cliente;
import com.transportadora.apilogistica.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping
    public List<Cliente> listar() {
        return clienteRepository.findAll();
    }
    // Retorna a lista de todos os clientes cadastrados no banco de dados.

    @GetMapping("/{id}")
    public Cliente buscarPorId(@PathVariable Integer id) {
        return clienteRepository.findById(id).orElse(null);
    }
    // Busca e retorna um cliente com base no ID informado na URL.
    // Se não for encontrado, retorna null.

    @PostMapping
    public Cliente criar(@RequestBody Cliente cliente) {
        return clienteRepository.save(cliente);
    }
    // Cria um novo cliente com os dados recebidos no corpo da requisição.
    // Retorna o cliente salvo com o ID gerado automaticamente.

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Integer id) {
        clienteRepository.deleteById(id);
    }
    // Exclui o cliente com o ID informado na URL.
    // Se o ID não existir, pode lançar exceção.
}
