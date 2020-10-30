package com.nsp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;


@Entity
public class ModelNavio {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@NotBlank(message = "Nome do Navio é necessário!")
	private String nomeNavio;
	@NotBlank(message = "Nome da Empresa é necessário!")
	private String nomeEmpresa;
	
	
	@NotNull(message = "CNPJ da Empresa é Necessário!")
	private Integer cnpjEmpresaProprietaria;
	
	@NotBlank(message = "País de Origem da Empresa Proprietária é necessário!")
	private String paisDeOrigem;

	@NotNull(message = "Categoria do Navio é Necessário!")
	@Range(min = 1, max = 2)
	private Integer categoriaNavio;

	@NotBlank(message = "Descrição de Categoria é necessário!")
	private String descrCategNavio;

	@NotBlank(message = "País de Origem é necessário!")
	private String origemNavio;
	

	@NotBlank(message = "País de Destino é necessário!")
	private String destinoNavio;

	public ModelNavio() {}

	@Override
	public String toString() {
		return "ModelNavio [id=" + id + ", nomeNavio=" + nomeNavio + ", nomeEmpresa=" + nomeEmpresa
				+ ", cnpjEmpresaProprietaria=" + cnpjEmpresaProprietaria + ", paisDeOrigem=" + paisDeOrigem
				+ ", categoriaNavio=" + categoriaNavio + ", descrCategNavio=" + descrCategNavio + ", origemNavio="
				+ origemNavio + ", destinoNavio=" + destinoNavio + "]";
	}

	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getNomeNavio() {
		return nomeNavio;
	}


	public void setNomeNavio(String nomeNavio) {
		this.nomeNavio = nomeNavio;
	}


	public String getNomeEmpresa() {
		return nomeEmpresa;
	}


	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}


	public Integer getCnpjEmpresaProprietaria() {
		return cnpjEmpresaProprietaria;
	}


	public void setCnpjEmpresaProprietaria(Integer cnpjEmpresaProprietaria) {
		this.cnpjEmpresaProprietaria = cnpjEmpresaProprietaria;
	}


	public String getPaisDeOrigem() {
		return paisDeOrigem;
	}


	public void setPaisDeOrigem(String paisDeOrigem) {
		this.paisDeOrigem = paisDeOrigem;
	}


	public Integer getCategoriaNavio() {
		return categoriaNavio;
	}


	public void setCategoriaNavio(Integer categoriaNavio) {
		this.categoriaNavio = categoriaNavio;
	}


	public String getDescrCategNavio() {
		return descrCategNavio;
	}


	public void setDescrCategNavio(String descrCategNavio) {
		this.descrCategNavio = descrCategNavio;
	}


	public String getOrigemNavio() {
		return origemNavio;
	}


	public void setOrigemNavio(String origemNavio) {
		this.origemNavio = origemNavio;
	}


	public String getDestinoNavio() {
		return destinoNavio;
	}


	public void setDestinoNavio(String destinoNavio) {
		this.destinoNavio = destinoNavio;
	}
}
