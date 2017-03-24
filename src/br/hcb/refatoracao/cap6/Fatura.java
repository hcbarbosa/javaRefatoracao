package br.hcb.refatoracao.cap6;

import static br.hcb.refatoracao.cap6.MoedaEnum.*;

public class Fatura {

	//private static final double VALOR_DOLAR = 2.7;
	private double valorMensal;
	private String cliente;

	public Fatura() {}

	public Fatura(double valorMensal, String cliente) {
		this.valorMensal = valorMensal;
		this.cliente = cliente;
	}
	public double getValorMensal() {
		return valorMensal;
	}
	public void setValorMensal(double valorMensal) {
		this.valorMensal = valorMensal;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public double emDolar() {
		//valor magico
		//usado em outros lugares
		//repeticao
		//return valorMensal * 2.7;
		//return valorMensal * VALOR_DOLAR;
		//return valorMensal * MoedaEnum.DOLAR.getTaxa();
		return valorMensal * DOLAR.getTaxa();
	}

}
