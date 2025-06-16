package com.transportadora.apilogistica.repository;

import com.transportadora.apilogistica.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

// Interface responsável pelas operações de acesso a dados da entidade Pedido.
// Estende JpaRepository, que fornece métodos prontos como save, findAll, findById, deleteById, etc.
public interface PedidoRepository extends JpaRepository<Pedido, Integer> {
}
