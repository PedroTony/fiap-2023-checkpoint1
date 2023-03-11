package br.com.fiap.checkpoint1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.checkpoint1.dados.Empregado;
import br.com.fiap.checkpoint1.servicos.EmpregadoServ;

@RestController
@RequestMapping("/empregados")	
public class EmpregadoContr {
	
	@Autowired
	EmpregadoServ empServ;
	
	@GetMapping
	public List<Empregado> get(){
		return empServ.get();
	}
	
	@PutMapping
	public Empregado put(Empregado emp) {
		return empServ.put(emp);
	}
	
	@PostMapping
	public Empregado post(Empregado emp) {
		return empServ.post(emp);
	}
	
}

