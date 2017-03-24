package br.hcb.refatoracao.cap2;

import java.util.List;

public class Trem {

	private List<Vagao> vagoes;
	private int capacidade;

	//semantica
	// nomes ruins para variaveis, metodos
	// funcao q retorna a qtd de reservas disponiveis
	// public boolean disp(int reservas) {
	//
	// int r = 0;
	// for(Vagao v : vagoes) {
	// r += v.reservados();
	// }
	//
	// r = capacidade - r;
	// return r > reservas;
	// }

	public boolean podeReservar(int lugaresAReservar) {
		//nao pode ter mais de um significado
		//lugares disponiveis
		//lugaresReservados = capacidade - lugaresReservados;
		
		int lugaresDisponiveis = capacidade - lugaresJaReservados();
		return lugaresDisponiveis > lugaresAReservar;
	}

	private int lugaresJaReservados() {
		int lugaresReservados = 0;
		for (Vagao vagao : vagoes) {
			lugaresReservados += vagao.reservados();
		}
		return lugaresReservados;
	}
}