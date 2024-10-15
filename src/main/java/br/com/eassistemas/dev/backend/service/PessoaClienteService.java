package br.com.eassistemas.dev.backend.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.eassistemas.dev.backend.dto.PessoaClienteRequestDTO;
import br.com.eassistemas.dev.backend.entity.Pessoa;
import br.com.eassistemas.dev.backend.repository.PessoaClienteRepository;

@Service
public class PessoaClienteService {    

    @Autowired
    private PessoaClienteRepository pessoaRepository;

  
    //inserir
    public Pessoa registrar(PessoaClienteRequestDTO pessoaClienteRequestDTO){
        Pessoa pessoa = new PessoaClienteRequestDTO().converter(pessoaClienteRequestDTO);
        pessoa.setDataCriacao(new Date());
        Pessoa novaPessoa = pessoaRepository.saveAndFlush(pessoa);
        return novaPessoa;
    }

}
