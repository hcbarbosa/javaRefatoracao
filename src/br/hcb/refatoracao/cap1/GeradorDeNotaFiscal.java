package br.hcb.refatoracao.cap1;

public class GeradorDeNotaFiscal {

	public NotaFiscal gera(Fatura fatura) {
		//quebra de métodos longos
		// metodos pequenos
		// manutencao mais facil
		// nomes mais facil para leitura
		NotaFiscal nf = geraNF(fatura);
		
		//enviaEmail(nf); gerador de nf nao deveria se responsabilizar pelo envio de email
		//salvaBanco(nf); e tbm nao salvar no banco

		new EnviaEmail().enviaEmail(nf);
		new NFDao().salvaBanco(nf);
		
		return nf;
	}

	private NotaFiscal geraNF(Fatura fatura) {
		// calcula valor do imposto
		double valor = fatura.getValorMensal();
		double imposto = 0;
		if(valor < 200) {
			imposto = valor * 0.03;
		}
		else if(valor > 200 && valor <= 1000) {
			imposto = valor * 0.06;
		}
		else {
			imposto = valor * 0.07;
		}
		
		NotaFiscal nf = new NotaFiscal(valor, imposto);
		return nf;
	}
}