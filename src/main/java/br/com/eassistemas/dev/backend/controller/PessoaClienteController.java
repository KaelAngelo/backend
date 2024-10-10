package br.com.eassistemas.dev.backend.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.eassistemas.dev.backend.dto.PessoaClienteRequestDTO;
import br.com.eassistemas.dev.backend.entity.Pessoa;
import br.com.eassistemas.dev.backend.service.PessoaService;

@RestController
@RequestMapping("/api/cliente")
public class PessoaClienteController {
    
    @Autowired
    private PessoaService pessoaService;

    //inserir
    @PostMapping("/")
    public Pessoa inserir(@RequestBody PessoaClienteRequestDTO pessoaClienteRequestDTO){
        Pessoa pessoa = new PessoaClienteRequestDTO().converter(pessoaClienteRequestDTO)
        return pessoaService.inserir(pessoa);
    }

}
