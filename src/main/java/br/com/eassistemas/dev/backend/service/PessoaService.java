package br.com.eassistemas.dev.backend.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.eassistemas.dev.backend.entity.Pessoa;
import br.com.eassistemas.dev.backend.repository.PessoaRepository;

@Service
public class PessoaService {    

    @Autowired
    private PessoaRepository pessoaRepository;

    //buscar
    public List<Pessoa> buscarTodos(){
        return pessoaRepository.findAll();
    }

    //inserir
    public Pessoa inserir(Pessoa pessoa){
        pessoa.setDataCriacao(new Date());
        Pessoa novaPessoa = pessoaRepository.saveAndFlush(pessoa);
        return novaPessoa;
    }

    //alterar
    public Pessoa alterar(Pessoa pessoa){
        pessoa.setDataAtualizacao(new Date());
        Pessoa novaPessoa = pessoaRepository.saveAndFlush(pessoa);
        return novaPessoa;
    }

    //excluir
    public void excluir(Long id){
        Pessoa pessoa = pessoaRepository.findById(id).get();
        pessoaRepository.delete(pessoa);        
    }

}
