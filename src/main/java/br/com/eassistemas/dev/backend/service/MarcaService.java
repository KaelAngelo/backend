package br.com.eassistemas.dev.backend.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.eassistemas.dev.backend.entity.Marca;
import br.com.eassistemas.dev.backend.repository.MarcaRepository;

@Service
public class MarcaService {
    
    @Autowired
    private MarcaRepository marcaRepository;

    public List<Marca> buscarTodos(){
        return marcaRepository.findAll();
    }

    public Marca inserir(Marca marca){
        marca.setDataCriacao(new Date());
        Marca novaMarca = marcaRepository.saveAndFlush(marca);
        return novaMarca;
    }

    public Marca alterar(Marca marca){
        marca.setDataAtualizacao(new Date());
        Marca novaMarca = marcaRepository.saveAndFlush(marca);
        return novaMarca;
    }

    public void excluir(Long id){
        Marca marca = marcaRepository.findById(id).get();
        marcaRepository.delete(marca);
    }

}
