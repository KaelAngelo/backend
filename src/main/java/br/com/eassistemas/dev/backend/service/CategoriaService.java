package br.com.eassistemas.dev.backend.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.eassistemas.dev.backend.entity.Categoria;
import br.com.eassistemas.dev.backend.repository.CategoriaRepository;

@Service
public class CategoriaService {
    
    @Autowired
    private CategoriaRepository categoriaRepository;

    //Listar
    public List<Categoria> buscarTodos(){
        return categoriaRepository.findAll();
    }

    //Inserir
    public Categoria inserir(Categoria categoria){
        categoria.setDataCriacao(new Date());
        return categoriaRepository.saveAndFlush(categoria);
    }

    //Alterar
    public Categoria alterar(Categoria categoria){
        categoria.setDataAtualizacao(new Date());
        return categoriaRepository.saveAndFlush(categoria);
    }

    //Excluir
    public void excluir(Long id){
        Categoria categoria = categoriaRepository.findById(id).get();
        categoriaRepository.delete(categoria);
    }
  
}
