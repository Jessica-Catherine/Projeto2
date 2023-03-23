package br.senai.sp.compras.model;

import java.time.LocalDate;

public class Compras {

	private int IdCompra;
	private LocalDate DtCompra;
	private float ValorCompra;
	private int QtdItens;

	public Compras() {
	
	}
	public Compras(int idCompra, LocalDate dtCompra, 
			float valorCompra, int qtdItens) {
		this.IdCompra = idCompra;
		this.DtCompra = dtCompra;
		this.ValorCompra = valorCompra;
		this.QtdItens = qtdItens;
	}
	public int getIdCompra() {
		return this.IdCompra;
	}
	public void setIdCompra(int idCompra) {
		this.IdCompra = idCompra;
	}
	public LocalDate getDtCompra() {
		return this.DtCompra;
	}
	public void setDtCompra(LocalDate dtCompra) {
		this.DtCompra = dtCompra;
	}
	public float getValorCompra() {
		return this.ValorCompra;
	}
	public void setValorCompra(float valorCompra) {
		this.ValorCompra = valorCompra;
	}
	public int getQtdItens() {
		return this.QtdItens;
	}
	public void setQtdItens(int qtdItens) {
		this.QtdItens = qtdItens;
	}
}