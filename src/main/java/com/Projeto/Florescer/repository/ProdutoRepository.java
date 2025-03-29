package com.Projeto.Florescer.repository;

import com.Projeto.Florescer.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
