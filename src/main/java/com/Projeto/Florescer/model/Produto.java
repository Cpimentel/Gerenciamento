package com.Projeto.Florescer.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;

@Entity
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descricao;
    private String categoria;
    private BigDecimal preco;
    private int quantidadeEstoque;
    private String unidadeMedida;
    private String codigoBarras;
    private String fornecedor;


}
