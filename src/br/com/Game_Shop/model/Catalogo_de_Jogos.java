package br.com.Game_Shop.model;

import java.util.Date;

public class Catalogo_de_Jogos {
	
	private String id_jogo;
	private String nome_jogo;
	private double preco;
	private int classificacao_idade;
	private String plataforma;
	
	public String getId() {
		return id_jogo;
	}
	public void setString(String id_jogo) {
		this.id_jogo = id_jogo;
	}
	public String getNome() {
		return nome_jogo;
	}
	public void setNome(String nome_jogo) {
		this.nome_jogo = nome_jogo;
	}
	public double getpreco() {
		return preco;
	}
	public void setpreco(double preco) {
		this.preco = preco;
	}
	public int getclassificacao() {
		return classificacao_idade;
	}
	public void setclassificacao(int classificacao) {
		this.classificacao_idade = classificacao;
	}
	public String getplataforma() {
		return plataforma;
	}
	public void setplataforma(String plataforma) {
		this.plataforma = plataforma;
	}
	public void add(Catalogo_de_Jogos Catalogo2) {
		// TODO Auto-generated method stub
		
	}
	
}
