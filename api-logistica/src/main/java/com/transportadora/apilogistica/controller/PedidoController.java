package com.transportadora.apilogistica.controller;

import com.transportadora.apilogistica.model.Pedido;
import com.transportadora.apilogistica.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    @Autowired
    private PedidoRepository pedidoRepository;

    @GetMapping
    public List<Pedido> listar() {
        return pedidoRepository.findAll();
    }
    // Retorna a lista de todos os pedidos cadastrados no banco de dados.

    @GetMapping("/{id}")
    public Pedido buscarPorId(@PathVariable Integer id) {
        return pedidoRepository.findById(id).orElse(null);
    }
    // Busca e retorna um pedido com base no ID informado na URL.
    // Se não for encontrado, retorna null.

    @PostMapping
    public Pedido criar(@RequestBody Pedido pedido) {
        return pedidoRepository.save(pedido);
    }
    // Cria um novo pedido com os dados recebidos no corpo da requisição.
    // Retorna o pedido salvo com o ID gerado automaticamente.

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Integer id) {
        pedidoRepository.deleteById(id);
    }
    // Exclui o pedido com o ID informado na URL.
    // Se o ID não existir, pode lançar exceção.
}
