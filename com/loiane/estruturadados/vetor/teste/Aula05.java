package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.Vetor;

public class Aula05 {

	public static void main(String[] args) {


		Vetor vetor = new Vetor(3);
		vetor.adicionar("Elemento 1"); //0
		vetor.adicionar("Elemento 2"); //1
		vetor.adicionar("Elemento 3"); //2

		System.out.println(vetor.busca(2));
		
		
	}

}
