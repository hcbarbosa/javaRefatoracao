package br.hcb.refatoracao.cap6;

public enum MoedaEnum {
	
	DOLAR(2.7),
	EURO(3.0);
	
	private double taxa;
	
	private MoedaEnum(double taxa) {
		this.taxa = taxa;
	}
	
	public double getTaxa(){
		return taxa;
	}
}
