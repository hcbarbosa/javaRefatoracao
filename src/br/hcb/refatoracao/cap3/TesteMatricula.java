package br.hcb.refatoracao.cap3;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class TesteMatricula {
	public static void main(String[] args) {
		Matricula matricula = new Matricula(false, new GregorianCalendar(2020, Calendar.APRIL, 2));

		// condicoes complexas em ifs
		// muitas condicoes
		// preferivel esconder em metodo
		// if(!matricula.isTrial() &&
		// matricula.getExpiracao().after(Calendar.getInstance())){
		// System.out.println("Vc é um usuário com acesso ilimitado.");
		// }

		if (matricula.estaValido()) {
			System.out.println("Vc é um usuário com acesso ilimitado.");
		}

		// if q pergunta ao objeto oq ele eh
		// melhor usar polimorfismo
		// if(funcionario.getCargo() == Desenvolvedor){
		// double salario = 1000;
		// }
		// if(funcionario.getCargo() == DBA){
		// double salario = 1000;
		// }
	}
}
