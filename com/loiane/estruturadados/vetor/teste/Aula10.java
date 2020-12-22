package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.VetorObjetos;

public class Aula10 {

	public static void main(String[] args) {

		VetorObjetos vetor = new VetorObjetos(3);
		
		Contato c1 = new Contato("Maria", "555-555","@maria");
		Contato c2 = new Contato("josé", "666-666", "@jose");
		Contato c3 = new Contato ("Pedro", "777-777","@Pedro");
		
		Contato c4 = new Contato ("Pedro", "777-777","@Pedro");
	
		vetor.adiciona(c1);
		vetor.adiciona(c2);
		vetor.adiciona(c3);
	
		
		System.out.println("Tamanho= "+ vetor.tamanho());
		int pos = vetor.busca(c4);
		if(pos> -1) {
			System.out.println("Elemento existe no vetor");
		}else {
			System.out.println("Elemento não existe no vetor");
		}
		
		System.out.println(vetor);
		
		
		
		
		
	}

}
