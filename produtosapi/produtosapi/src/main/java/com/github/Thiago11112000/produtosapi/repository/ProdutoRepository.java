package com.github.Thiago11112000.produtosapi.repository;

import com.github.Thiago11112000.produtosapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, String> {
    List<Produto> findByNomeIgnoreCase(String nome);
}
