package com.transportadora.apilogistica.repository;

import com.transportadora.apilogistica.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {}