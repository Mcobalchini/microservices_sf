package com.mcobalchini.produtos.repository;

import com.mcobalchini.produtos.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutosRepository extends JpaRepository<Produto, Long>{}

