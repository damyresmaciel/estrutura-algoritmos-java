package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.Vetor;

public class Aula09 {

	public static void main(String[] args) {


		Vetor vetor = new Vetor(10);
		vetor.adicionar("B");
		vetor.adicionar("C");
		vetor.adicionar("E");
		vetor.adicionar("F");
		vetor.adicionar("G");
		
		System.out.println(vetor);
		
		System.out.println();
		
		//vetor.remove(1);
		
		System.out.println(vetor);
		
		System.out.println();
		
		System.out.println("Remover o elemento E");
		
		int pos = vetor.busca("E");
		if(pos > -1) {
			vetor.remove(pos);
		} else {
			System.out.println("Elemento não existe  no vetor");
		}
		System.out.println(vetor);
	}

}
