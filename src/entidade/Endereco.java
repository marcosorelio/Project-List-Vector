package entidade;

public class Endereco {
	
	private String rua;
	private String bairro;
	private String cidade;
	
	public Endereco() {
		// TODO Auto-generated constructor stub
	}

	public Endereco(String rua, String bairro, String cidade) {
		super();
		this.rua = rua;
		this.bairro = bairro;
		this.cidade = cidade;
	}

	@Override
	public String toString() {
		return "Endereco [rua=" + rua + ", bairro=" + bairro + ", cidade="
				+ cidade + "]";
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	

}
