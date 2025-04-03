package com.Projeto.Florescer.service;

import com.Projeto.Florescer.model.Produto;
import com.Projeto.Florescer.repository.ProdutoRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository produtoRepository;


    public List<Produto> findAll(){
        var find = produtoRepository.findAll();
        return find;

    }
    public Produto searchById(Long id){
        return produtoRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Produto não encontrado!"));
    }

    public Produto save(Produto produto){
        return produtoRepository.save(produto);
    }

    public Produto updateByid(Long id, Produto produtoN){
        Produto produto = searchById(id);
        produto.setDescricao(produtoN.getDescricao());
        produto.setCategoria(produtoN.getCategoria());
        produto.setPreco(produtoN.getPreco());
        produto.setQuantidadeEstoque(produtoN.getQuantidadeEstoque());
        produto.setUnidadeMedida(produtoN.getUnidadeMedida());
        produto.setCodigoBarras(produtoN.getCodigoBarras());
        produto.setFornecedor(produtoN.getFornecedor());
        return  produtoRepository.save(produto);
    }
}
