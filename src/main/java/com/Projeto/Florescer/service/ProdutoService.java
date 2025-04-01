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
}
