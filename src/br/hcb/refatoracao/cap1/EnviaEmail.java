package br.hcb.refatoracao.cap1;

public class EnviaEmail {

	public void enviaEmail(NotaFiscal nf) {
		// envia email
		String msgDoEmail = "Caro cliente,<br/>";
		msgDoEmail += "� com prazer que lhe avisamos que sua nota fiscal foi "
				+ "gerada no valor de " + nf.getValorLiquido() + ".<br/>";
		msgDoEmail += "Acesse o site da prefeitura e fa�a o download.<br/><br/>";
		msgDoEmail += "Obrigado!";
		
		System.out.println(msgDoEmail);
	}
}
