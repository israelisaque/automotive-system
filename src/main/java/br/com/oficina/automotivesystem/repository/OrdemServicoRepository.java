package br.com.oficina.automotivesystem.repository;

import br.com.oficina.automotivesystem.model.OrdemServico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdemServicoRepository extends JpaRepository<OrdemServico, Long>  {
}

