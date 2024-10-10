package br.com.eassistemas.dev.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.eassistemas.dev.backend.entity.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
    
}
