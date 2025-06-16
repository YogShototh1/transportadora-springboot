package com.transportadora.apilogistica.model;

import jakarta.persistence.*;

@Entity
@Table(name = "clientes")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cliente")
    private Integer id;
    // Identificador único do cliente (chave primária), gerado automaticamente.

    private String nome;
    // Nome completo do cliente.

    private String email;
    // E-mail de contato do cliente.

    private String telefone;
    // Número de telefone do cliente.

    @ManyToOne
    @JoinColumn(name = "id_cidade")
    private Cidade cidade;
    // Associação com a cidade onde o cliente está localizado (chave estrangeira para a tabela "cidades").

    // Getters e Setters
    public Integer getId() {
        return id;
    }
    // Retorna o ID do cliente.

    public void setId(Integer id) {
        this.id = id;
    }
    // Define o ID do cliente.

    public String getNome() {
        return nome;
    }
    // Retorna o nome do cliente.

    public void setNome(String nome) {
        this.nome = nome;
    }
    // Define o nome do cliente.

    public String getEmail() {
        return email;
    }
    // Retorna o e-mail do cliente.

    public void setEmail(String email) {
        this.email = email;
    }
    // Define o e-mail do cliente.

    public String getTelefone() {
        return telefone;
    }
    // Retorna o telefone do cliente.

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    // Define o telefone do cliente.

    public Cidade getCidade() {
        return cidade;
    }
    // Retorna a cidade associada ao cliente.

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }
    // Define a cidade associada ao cliente.
}
