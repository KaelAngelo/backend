package br.com.eassistemas.dev.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.eassistemas.dev.backend.entity.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
    
}
