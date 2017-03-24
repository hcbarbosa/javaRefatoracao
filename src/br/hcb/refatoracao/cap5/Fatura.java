package br.hcb.refatoracao.cap5;

public class Fatura {

	private double valorMensal;
	private String cliente;

	public Fatura() {
	}

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

	// parametros booleanos que mudam comportamento de metodo nao devem ser
	// usados
	// para resolver isso poderia sparar em dois metodos
	// public double converteValor(boolean dolar) {
	// double taxa = 1;
	// if (dolar) taxa = 2.7;
	// return valorMensal * taxa;
	// }

	public double emDolar() {
		return converteValor(2.7);
	}

	public double emReal() {
		return converteValor(1);
	}
	
	private double converteValor(double taxa){
		return valorMensal * taxa;
	}
}
