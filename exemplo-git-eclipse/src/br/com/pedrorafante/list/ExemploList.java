package br.com.pedrorafante.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploList {

	public static void main(String[] args) {
		
		List<String> nomes = new ArrayList<>();
		
		nomes.add("Pedro");
		nomes.add("Paulo");
		nomes.add("Maria");
		nomes.add("Juliano");
		nomes.add("Luanna");
		nomes.add("Fabíola");
		nomes.add("Sanfona");
		
		//Listar a lista conforme foi adicionada
        System.out.println(nomes);
				
		nomes.set(2, "Rafante");
		
		//Listar a lista conforme foi adicionada
		System.out.println(nomes);
		
		//Ordenar a Lista de forma alfabetica
		Collections.sort(nomes);
		System.out.println(nomes);
		
		nomes.set(2, "Larissa");
		System.out.println(nomes);
		
		nomes.remove(3);
		System.out.println(nomes);
		
		nomes.remove("Larissa");
		System.out.println(nomes);
		
		String nome = nomes.get(1);
		System.out.println(nome);
		
		int tamanhoLista = nomes.size();
		System.out.println(tamanhoLista);
		
		boolean temPedro = nome.contains("Fernando");
		System.out.println(temPedro);
		
	}

}
