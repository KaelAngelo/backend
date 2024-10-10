package br.com.eassistemas.dev.backend.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.eassistemas.dev.backend.entity.Cidade;
import br.com.eassistemas.dev.backend.repository.CidadeRepository;

@Service
public class CidadeService {
    
    @Autowired
    private CidadeRepository cidadeRepository;

    //listar
    public List<Cidade> buscarTodos(){
        return cidadeRepository.findAll();
    }

    //inserir
    public Cidade inserir(Cidade cidade){
        cidade.setDataCriacao(new Date());
        Cidade novaCidade = cidadeRepository.saveAndFlush(cidade);
        return novaCidade;
    }

    //alterar
    public Cidade alterar(Cidade cidade){
        cidade.setDataAtualizacao(new Date());
        Cidade novaCidade = cidadeRepository.saveAndFlush(cidade);
        return novaCidade;
    }

    //excluir
    public void excluir(Long id){
        Cidade cidade = cidadeRepository.findById(id).get();
        cidadeRepository.delete(cidade);
    }
    
}
