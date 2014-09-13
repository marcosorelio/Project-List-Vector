package colecao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lista {

	List<String> nomes = new ArrayList<String>();

	public static void main(String[] args) {
		Lista lista = new Lista();

		lista.nomes.add("Beto");
		lista.nomes.add("Jose");
		lista.nomes.add("Duda");

		List<Integer> numeros = new ArrayList<Integer>();

		numeros.add(25);
		numeros.add(38);
		numeros.add(12);
		numeros.add(29);

		System.out.println("Lista: " + numeros);

		Collections.sort(numeros);
		System.out.println("Lista Ordenada: " + numeros);

		numeros.set(2, 10);
		System.out.println("Maior: " + Collections.max(numeros));

		numeros.remove(2);
		
		
		for (int i = 0; i < numeros.size(); i++) {
			System.out.println(numeros.get(i));
		}

		System.out.println("Nome na posição 1: " + lista.nomes.get(1));
		for (String nome : lista.nomes) {
			System.out.println(nome.toUpperCase());
		}
	}

}
