package br.com.eassistemas.dev.backend.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import br.com.eassistemas.dev.backend.entity.Permissao;
import br.com.eassistemas.dev.backend.entity.PermissaoPessoa;
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
        
        List<Permissao> listaPermissao = permissaoRepository.findByNome("cliente");
        if(listaPermissao.size()>0){
            PermissaoPessoa permissaoPessoa = new PermissaoPessoa();
            permissaoPessoa.setPessoa(pessoa);
            permissaoPessoa.setPermissao(listaPermissao.get(0));
            permissaoPessoaRepository.saveAndFlush(permissaoPessoa);
          
        }
        
        
    }
    
}
