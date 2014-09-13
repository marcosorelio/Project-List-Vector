package entidade;

import java.util.List;

public class Cliente {

	private Integer codigoCli;
	private String nome;
	private String sexo;

	private List<Bens> listaBens;

	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	public Cliente(Integer codigoCli, String nome, String sexo) {
		super();
		this.codigoCli = codigoCli;
		this.nome = nome;
		this.sexo = sexo;
	}

	

	@Override
	public String toString() {
		return "Cliente [codigoCli=" + codigoCli + ", nome=" + nome + ", sexo="
				+ sexo + ", listaBens=" + listaBens + "]";
	}

	public Integer getCodigoCli() {
		return codigoCli;
	}

	public void setCodigoCli(Integer codigoCli) {
		this.codigoCli = codigoCli;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public List<Bens> getListaBens() {
		return listaBens;
	}

	public void setListaBens(List<Bens> listaBens) {
		this.listaBens = listaBens;
	}

	

}
