package br.com.fiap.checkpoint1.servicos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.checkpoint1.dados.Empregado;
import br.com.fiap.checkpoint1.repository.EmpregadoReposit;

@Service
public class EmpregadoServ {
	
	@Autowired
	EmpregadoReposit empRep;
	
	public List<Empregado> get(){
		return empRep.findAll();
	}
	
	public Empregado put(Empregado emp) {
		return empRep.save(emp);
	}
	
	public Empregado post(Empregado emp) {
		return empRep.save(emp);
	}
	
}
