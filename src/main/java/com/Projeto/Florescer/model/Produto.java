package com.Projeto.Florescer.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name = "produto")
@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
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
