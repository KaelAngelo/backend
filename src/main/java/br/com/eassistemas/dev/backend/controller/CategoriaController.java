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

import br.com.eassistemas.dev.backend.entity.Categoria;
import br.com.eassistemas.dev.backend.service.CategoriaService;

@RestController
@RequestMapping("/api/categoria")
public class CategoriaController {
    
    @Autowired
    private CategoriaService categoriaService;

    //listar
    @GetMapping("/")
    public List<Categoria> listar(){
        return categoriaService.buscarTodos();
    }

    //inserir
    @PostMapping("/")
    public Categoria inserir(@RequestBody Categoria categoria){
        return categoriaService.inserir(categoria);
    }

    //alterar
    @PutMapping("/")
    public Categoria alterar(@RequestBody Categoria categoria){
        return categoriaService.alterar(categoria);
    }

    //excluir
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable("id") Long id){
         categoriaService.excluir(id);
        return ResponseEntity.ok().build();
    }
}
