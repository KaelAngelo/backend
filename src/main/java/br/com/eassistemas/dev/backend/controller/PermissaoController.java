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
import br.com.eassistemas.dev.backend.entity.Permissao;
import br.com.eassistemas.dev.backend.service.PermissaoService;

@RestController
@RequestMapping("/api/permissao")
public class PermissaoController {
    
    @Autowired
    private PermissaoService permissaoService;
    

    //buscar
    @GetMapping("/")
    public List<Permissao> buscarTodos(){
        return permissaoService.buscarTodos();
    }
    //inserir
    @PostMapping("/")
    public Permissao inserir(@RequestBody Permissao permissao){
       return permissaoService.inserir(permissao);
    }
    //alterar
    @PutMapping("/")
    public Permissao alterar(@RequestBody Permissao permissao){
        return permissaoService.alterar(permissao);
    }
    //excluir
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable("id") Long id){
        permissaoService.excluir(id);
        return ResponseEntity.ok().build();
    }
}

