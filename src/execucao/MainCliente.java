package execucao;

import java.util.ArrayList;

import entidade.Bens;
import entidade.Cliente;

public class MainCliente {

	public static void main(String[] args) {

		Bens bem = new Bens(2501, "Apto", 350000.);
		Cliente c1 = new Cliente(101, "Rui", "m");
		bem.setCliente(c1);

		System.out.println("Bem: " + bem.getNome() + ",Cliente:"
				+ bem.getCliente().getNome());

		Cliente c2 = new Cliente(102, "Mel", "f");
		c2.setListaBens(new ArrayList<Bens>());

		c2.getListaBens().add(new Bens(2607, "Carro", 40000.));
		c2.getListaBens().add(new Bens(2608, "Casa", 390000.));

		System.out.println(c2);
		System.out.println("Cliente: " + c2.getNome());
		
		for (Bens b : c2.getListaBens()) {
			System.out.println(b);
		}

	}

}
