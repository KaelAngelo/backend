package br.com.eassistemas.dev.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import br.com.eassistemas.dev.backend.entity.ProdutoImagens;
import br.com.eassistemas.dev.backend.service.ProdutoImagensService;

@RestController
@RequestMapping("/api/produtoImagens")
public class ProdutoImagensController {
    
    @Autowired
    private ProdutoImagensService produtoImagensService;

    //buscar
    @GetMapping("/")
    public List<ProdutoImagens> buscarTodos(){
        return produtoImagensService.buscarTodos();
    }
    //inserir
    @PostMapping("/")
    public ProdutoImagens inserir(@RequestParam("file") MultipartFile file, @RequestParam("idProduto") Long id){
        return produtoImagensService.inserir(id, file);
    }
    //alterar
    @PutMapping("/")
    public ProdutoImagens alterar(@RequestBody )
    //excuir
}
