package entidade;

public class Bens {

	private Integer codigoBem;
	private String nome;
	private Double valor;

	private Cliente cliente;

	public Bens() {
		// TODO Auto-generated constructor stub
	}

	public Bens(Integer codigoBem, String nome, Double valor) {
		super();
		this.codigoBem = codigoBem;
		this.nome = nome;
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Bens [codigoBem=" + codigoBem + ", nome=" + nome + ", valor="
				+ valor + "]";
	}

	public Integer getCodigoBem() {
		return codigoBem;
	}

	public void setCodigoBem(Integer codigoBem) {
		this.codigoBem = codigoBem;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
