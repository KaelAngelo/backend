package br.com.eassistemas.dev.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.eassistemas.dev.backend.entity.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    
}
