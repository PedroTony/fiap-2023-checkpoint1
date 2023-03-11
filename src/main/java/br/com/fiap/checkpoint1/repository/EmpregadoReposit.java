package br.com.fiap.checkpoint1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fiap.checkpoint1.dados.Empregado;

@Repository
public interface EmpregadoReposit extends JpaRepository<Empregado, Long>{

}
