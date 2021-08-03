package br.com.oficina.automotivesystem.repository;

import br.com.oficina.automotivesystem.model.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VeiculoRepository extends JpaRepository<Veiculo, Long>  {
}

