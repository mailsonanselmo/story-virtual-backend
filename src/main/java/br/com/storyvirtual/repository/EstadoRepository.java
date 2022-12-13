package br.com.storyvirtual.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.storyvirtual.entity.Estado;

public interface EstadoRepository extends JpaRepository<Estado, Long> {
    
}
