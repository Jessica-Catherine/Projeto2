package br.senai.sp.endereco.model;

import lombok.Data;

@Data
public class Endereco {

	private int idEndereco;
	private String uf;
	private String numero;
	private String cep;
	private String logradouro;
	private String cidade;
	private String bairro;
	private String complemento;



	public Endereco() {
	}

	public Endereco(int idEndereco, String uf, String numero, String cep, String logradouro, String cidade,
			String bairro, String complemento) {

		this.idEndereco = idEndereco;
		this.uf = uf;
		this.numero = numero;
		this.cep = cep;
		this.logradouro = logradouro;
		this.cidade = cidade;
		this.bairro = bairro;
		this.complemento = complemento;
	}


}
