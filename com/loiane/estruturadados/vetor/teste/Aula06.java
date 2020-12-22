package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.Vetor;

public class Aula06 {

	public static void main(String[] args) {


		Vetor vetor = new Vetor(3);
		vetor.adicionar("Elemento 1"); 
		vetor.adicionar("Elemento 2"); 
		vetor.adicionar("Elemento 3");
		
		System.out.println(vetor.busca("elemento 1"));
		System.out.println("Elemento 3");
	}

}
