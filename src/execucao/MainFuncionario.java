package execucao;

import entidade.Endereco;
import entidade.Funcionario;

public class MainFuncionario {
	
	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario();
		Funcionario f2 = new Funcionario(102,"Leo","m",2300.);
		Funcionario f3 = new Funcionario(103,"Nat","f",4600.);
		Funcionario f4 = new Funcionario(104,"Rui","m",300.);
		
		f1.setCodigo(101);
		f1.setNome("Ana");
		f1.setSexo("f");
		f1.setSalario(3100.);
		
		Endereco end = new Endereco("Rua a","Bairro b","Cidade q");
		
		f1.setEndereco(end);
		f2.setEndereco(new Endereco("Rua s","Bairro x","Cidade e"));
		f3.setEndereco(new Endereco());
		f3.getEndereco().setRua("Rua d");
		f3.getEndereco().setBairro("Bairro n");
		f3.getEndereco().setCidade("Cidade t");
		
		System.out.println("Nome: "+f1.getNome());
		System.out.println("Rua: "+f1.getEndereco().getRua());
		System.out.println("Bairro: "+f1.getEndereco().getBairro());
		System.out.println("Cidade: "+f1.getEndereco().getCidade());
		
		System.out.println(f2);
		System.out.println(f3);
		System.out.println(f4);
		
		
	}

}
