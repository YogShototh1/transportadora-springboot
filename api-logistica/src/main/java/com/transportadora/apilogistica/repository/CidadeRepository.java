package com.transportadora.apilogistica.repository;

import com.transportadora.apilogistica.model.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CidadeRepository extends JpaRepository<Cidade, Integer> {
}
