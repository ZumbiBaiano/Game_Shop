package br.com.Game_Shop.model;

import java.util.Date;

public class Clientes {
	
	private String id_cliente;
	private String nome_cliente;
	private String cpf;
	private String email;
	private String endereco;
	
	public String getId() {
		return id_cliente;
	}
	public void setString(String id_cliente) {
		this.id_cliente = id_cliente;
	}
	public String getNome() {
		return nome_cliente;
	}
	public void setNome(String nome_cliente) {
		this.nome_cliente = nome_cliente;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void add(Clientes clientes2) {
		// TODO Auto-generated method stub
		
	}
	
}
