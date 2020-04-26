package com.messzsoarz.estoque.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ItemEstoque {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;
	private long Grupo;
	private long CodigoProduto;
	
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public long getGrupo() {
		return Grupo;
	}
	public void setGrupo(long grupo) {
		Grupo = grupo;
	}
	public long getCodigoProduto() {
		return CodigoProduto;
	}
	public void setCodigoProduto(long codigoProduto) {
		CodigoProduto = codigoProduto;
	}
}
