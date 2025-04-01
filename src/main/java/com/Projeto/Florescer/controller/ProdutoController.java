package com.Projeto.Florescer.controller;


import com.Projeto.Florescer.repository.ProdutoRepository;
import com.Projeto.Florescer.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    public ProdutoService repository;

    @GetMapping
    public ResponseEntity catchALL(){
        var list = repository.findAll();
        return ResponseEntity.ok(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity findById(@PathVariable Long id){
        return ResponseEntity.ok(repository.searchById(id));
    }

}
