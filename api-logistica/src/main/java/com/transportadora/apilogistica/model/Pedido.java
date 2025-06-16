package com.transportadora.apilogistica.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "pedidos")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pedido")
    private Integer id;
    // Identificador único do pedido (chave primária), gerado automaticamente.

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;
    // Associação com o cliente que fez o pedido (chave estrangeira para a tabela "clientes").

    private LocalDate data;
    // Data em que o pedido foi realizado.

    @Column(name = "valor_total")
    private BigDecimal valorTotal;
    // Valor total do pedido.

    // Getters e Setters
    public Integer getId() {
        return id;
    }
    // Retorna o ID do pedido.

    public void setId(Integer id) {
        this.id = id;
    }
    // Define o ID do pedido.

    public Cliente getCliente() {
        return cliente;
    }
    // Retorna o cliente associado ao pedido.

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    // Define o cliente associado ao pedido.

    public LocalDate getData() {
        return data;
    }
    // Retorna a data em que o pedido foi realizado.

    public void setData(LocalDate data) {
        this.data = data;
    }
    // Define a data do pedido.

    public BigDecimal getValorTotal() {
        return valorTotal;
    }
    // Retorna o valor total do pedido.

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }
    // Define o valor total do pedido.
}
