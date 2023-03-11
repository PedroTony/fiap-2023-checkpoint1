package br.com.fiap.checkpoint1.dados;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "empregados")
public class Empregado {
	@Id
	private long codigoEmpregado;
	private String nome, endereco;
	
	public Empregado() {
	}
	
	public long getCodigoEmpregado() {
		return codigoEmpregado;
	}
	
	public void setCodigoEmpregado(long codigoEmpregado) {
		this.codigoEmpregado = codigoEmpregado;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
	
}
