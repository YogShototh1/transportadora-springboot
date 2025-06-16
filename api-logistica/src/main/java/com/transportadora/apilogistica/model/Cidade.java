package com.transportadora.apilogistica.model;

import jakarta.persistence.*;

@Entity
@Table(name = "cidades")
public class Cidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cidade")
    private Integer id;
    // Identificador único da cidade (chave primária), gerado automaticamente pelo banco.

    private String nome;
    // Nome da cidade.

    private String estado;
    // Sigla ou nome do estado ao qual a cidade pertence.

    // Getters e Setters
    public Integer getId() {
        return id;
    }
    // Retorna o ID da cidade.

    public void setId(Integer id) {
        this.id = id;
    }
    // Define o ID da cidade.

    public String getNome() {
        return nome;
    }
    // Retorna o nome da cidade.

    public void setNome(String nome) {
        this.nome = nome;
    }
    // Define o nome da cidade.

    public String getEstado() {
        return estado;
    }
    // Retorna o estado da cidade.

    public void setEstado(String estado) {
        this.estado = estado;
    }
    // Define o estado da cidade.
}
