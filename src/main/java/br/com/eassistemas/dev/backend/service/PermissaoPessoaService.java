package br.com.eassistemas.dev.backend.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.eassistemas.dev.backend.entity.Pessoa;
import br.com.eassistemas.dev.backend.repository.PermissaoPessoaRepository;
import br.com.eassistemas.dev.backend.repository.PermissaoRepository;

@Service
public class PermissaoPessoaService {
    
    @Autowired
    private PermissaoPessoaRepository permissaoPessoaRepository;

    @Autowired
    private PermissaoRepository permissaoRepository;

    public void vincularPessoaPermissaoCliente(Pessoa pessoa){

        
    }
    
}
