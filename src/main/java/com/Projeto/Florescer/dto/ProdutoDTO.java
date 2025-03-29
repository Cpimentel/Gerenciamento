package com.Projeto.Florescer.dto;

public record ProdutoDTO (String descricao,
                          String categoria,
                          Double preco,
                          int quantidadeEstoque,
                          String unidadeMedida,
                          String codigoBarras,
                          String fornecedor){
}
