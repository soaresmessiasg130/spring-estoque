package com.messzsoarz.estoque.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Produto {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	public long Codigo;
	@NotBlank
	private String Nome;
	@NotBlank
	private String Descricao;
	@NotBlank
	private String Tamanho;
	@NotBlank
	private String Validade; 
	@NotBlank
	private String Data;
	
	public long getCodigo() {
		return Codigo;
	}
	public void setCodigo(long codigo) {
		Codigo = codigo;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getDescricao() {
		return Descricao;
	}
	public void setDescricao(String descricao) {
		Descricao = descricao;
	}
	public String getTamanho() {
		return Tamanho;
	}
	public void setTamanho(String tamanho) {
		Tamanho = tamanho;
	}
	public String getValidade() {
		return Validade;
	}
	public void setValidade(String validade) {
		Validade = validade;
	}
	public String getData() {
		return Data;
	}
	public void setData(String data) {
		Data = data;
	}
}
