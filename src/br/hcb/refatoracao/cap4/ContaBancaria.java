package br.hcb.refatoracao.cap4;

public abstract class ContaBancaria {
	//refatorando codigo duplicado
	protected String titular;
	protected double saldo;

	public ContaBancaria(String titular, double saldoInicial) {
		this.titular = titular;
		this.saldo = saldoInicial;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public String getTitular() {
		return titular;
	}
	
	public void saca(double valor) {
		saldo -= valor;
	}
	
	public void deposita(double valor) {
		saldo += valor;
	}
}
