package br.hcb.refatoracao.cap3;

import java.util.Calendar;

public class Matricula {

	private boolean trial;
	private Calendar expiracao;
	
	public Matricula(boolean ehTrial, Calendar expiracao) {
		this.trial = ehTrial;
		this.expiracao = expiracao;
	}
	
	public boolean isTrial() {
		return trial;
	}
	
	public Calendar getExpiracao() {
		return expiracao;
	}

	public boolean estaValido() {
		return !(this.isTrial() && this.getExpiracao().after(Calendar.getInstance()));
	}
}
