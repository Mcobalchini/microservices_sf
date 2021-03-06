package com.mcobalchini.produtos.api;

import com.mcobalchini.produtos.model.Produto;
import com.mcobalchini.produtos.repository.ProdutosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("")
public class ProdutoApi {
    @Autowired
    private ProdutosRepository repository;

    @GetMapping
    public List<Produto> all(){
        return repository.findAll();
    }

    @GetMapping("{id}")
    public Optional<Produto> one (@PathVariable("id") Long id){
        return repository.findById(id);
    }
}
