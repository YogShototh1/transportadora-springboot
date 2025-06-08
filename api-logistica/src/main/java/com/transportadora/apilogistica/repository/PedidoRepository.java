package com.transportadora.apilogistica.repository;

import com.transportadora.apilogistica.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Integer> {}