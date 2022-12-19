package br.com.storyvirtual.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.storyvirtual.entity.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Long> {
    
}
