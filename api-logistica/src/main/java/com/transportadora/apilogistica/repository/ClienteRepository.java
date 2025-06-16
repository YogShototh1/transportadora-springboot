package com.transportadora.apilogistica.repository;

import com.transportadora.apilogistica.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

// Interface responsável por realizar operações de acesso a dados (CRUD) da entidade Cliente.
// Estende JpaRepository, fornecendo métodos prontos para salvar, buscar, listar e deletar clientes.
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
