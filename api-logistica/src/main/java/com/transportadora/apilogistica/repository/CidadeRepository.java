package com.transportadora.apilogistica.repository;

import com.transportadora.apilogistica.model.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;

// Interface responsável por realizar operações de acesso a dados (CRUD) da entidade Cidade.
// Estende JpaRepository para herdar métodos como save, findById, findAll, deleteById, etc.
public interface CidadeRepository extends JpaRepository<Cidade, Integer> {
}
