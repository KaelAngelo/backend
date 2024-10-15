
package br.com.eassistemas.dev.backend.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.eassistemas.dev.backend.entity.Permissao;

public interface PermissaoRepository extends JpaRepository<Permissao, Long> {
    
  List<Permissao> findByNome(String nome);

}
