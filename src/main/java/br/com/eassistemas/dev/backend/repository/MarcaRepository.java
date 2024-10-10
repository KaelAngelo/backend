package br.com.eassistemas.dev.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.eassistemas.dev.backend.entity.Marca;

public interface MarcaRepository extends JpaRepository<Marca, Long> {
    
}
