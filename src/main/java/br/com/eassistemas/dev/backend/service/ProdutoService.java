package br.com.eassistemas.dev.backend.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.eassistemas.dev.backend.entity.Produto;
import br.com.eassistemas.dev.backend.repository.ProdutoRepository;


@Service
public class ProdutoService {
    
    @Autowired
    private ProdutoRepository produtoRepository;

    //buscar
    public List<Produto> buscarTodos(){
        return produtoRepository.findAll();
    }
    //inserir
    public Produto inserir(Produto produto){
        produto.setDataCriacao(new Date());
        Produto novoProduto = produtoRepository.saveAndFlush(produto);
        return novoProduto;
    }
    //alterar
    public Produto alterar(Produto produto){
        produto.setDataAtualizacao(new Date());
        Produto novoProduto = produtoRepository.saveAndFlush(produto);
        return novoProduto;
    }
    //excluir
    public void excluir(Long id){
        Produto produto = produtoRepository.findById(id).get();
        produtoRepository.delete(produto);
    }
}
