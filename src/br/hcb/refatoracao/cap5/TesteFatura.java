package br.hcb.refatoracao.cap5;

public class TesteFatura {

	public static void main(String[] args) {
		Fatura fatura = new Fatura(10, "Hanna");
		
		double valor1 = fatura.emReal();
		double valor2 = fatura.emDolar();
		
		System.out.println(valor1);
		System.out.println(valor2);
	}

}
