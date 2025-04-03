package com.Projeto.Florescer.controller;


import com.Projeto.Florescer.model.Produto;
import com.Projeto.Florescer.repository.ProdutoRepository;
import com.Projeto.Florescer.service.ProdutoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public ResponseEntity<Produto> saveProduct(@Valid @RequestBody Produto produto){
        return ResponseEntity.ok(repository.save(produto));

    }

    @PutMapping("/{id}")
    public ResponseEntity<Produto> updateProduct(@PathVariable Long id, @Valid @RequestBody Produto produto){
        return ResponseEntity.ok(repository.updateByid(id, produto));
    }

}
