package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.Lista;

public class Aula11 {

	public static void main(String[] args) {

		Lista<Contato> vetor = new Lista<Contato>(1);
		Contato c1 = new Contato("Maria", "555-555","@maria");
		Contato c2 = new Contato("josé", "666-666", "@jose");
		Contato c3 = new Contato ("Pedro", "777-777","@Pedro");
		
		vetor.adiciona(c1);
		vetor.adiciona(c2);
		System.out.println(c1);
		System.out.println(c2);
        
	}

}
