package br.com.eassistemas.dev.backend.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.eassistemas.dev.backend.entity.Permissao;
import br.com.eassistemas.dev.backend.repository.PermissaoRepository;

@Service
public class PermissaoService {
    
    @Autowired
    private PermissaoRepository permissaoRepository;

    //buscar
    public List<Permissao> buscarTodos(){
        return permissaoRepository.findAll();
    }
    //inserir
    public Permissao inserir(Permissao permissao){
        permissao.setDataCriacao(new Date());
        return permissaoRepository.saveAndFlush(permissao);
    }
    //alterar
    public Permissao alterar(Permissao permissao){
        permissao.setDataAtualizacao(new Date());
        return permissaoRepository.saveAndFlush(permissao);
    }
    //excluir
    public void excluir(Long id){
        Permissao permissao = permissaoRepository.findById(id).get();
        permissaoRepository.delete(permissao);

    }
}
