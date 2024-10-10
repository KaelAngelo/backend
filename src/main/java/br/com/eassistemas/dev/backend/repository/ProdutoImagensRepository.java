package br.com.eassistemas.dev.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.eassistemas.dev.backend.entity.ProdutoImagens;

public interface ProdutoImagensRepository extends JpaRepository<ProdutoImagens, Long> {
    
}
