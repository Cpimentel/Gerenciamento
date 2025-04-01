package com.Projeto.Florescer.service;

import com.Projeto.Florescer.model.Produto;
import com.Projeto.Florescer.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository repository;


    public List<Produto> findAll(){
        var find = repository.findAll();
        return find;

    }
}
