package br.com.eassistemas.dev.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.eassistemas.dev.backend.entity.Produto;
import br.com.eassistemas.dev.backend.service.ProdutoService;

@RestController
@RequestMapping("/api/produto")
public class ProdutoController {
    
    @Autowired
    private ProdutoService produtoService;

    //buscar
    @GetMapping("/")
    public List<Produto> buscarTodos(){
        return produtoService.buscarTodos();
    }
    //inserir
    @PostMapping("/")
    public Produto inserir(@RequestBody Produto produto){
        return produtoService.inserir(produto);
    }
    //alterar
    @PutMapping("/")
    public Produto alterar(@RequestBody Produto produto){
        return produtoService.alterar(produto);
    }
    //excluir
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable("id") Long id){
        produtoService.excluir(id);
        return ResponseEntity.ok().build();
    }
}
