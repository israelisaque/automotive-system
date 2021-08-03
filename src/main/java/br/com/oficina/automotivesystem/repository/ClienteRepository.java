package br.com.oficina.automotivesystem.repository;

import br.com.oficina.automotivesystem.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long>  {
}

