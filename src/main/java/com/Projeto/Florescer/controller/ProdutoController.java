package com.Projeto.Florescer.controller;


import com.Projeto.Florescer.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    public ProdutoRepository produtoRepository;

    @GetMapping
    public ResponseEntity catchALL(){
        return ResponseEntity.ok("ok");
    }

}
