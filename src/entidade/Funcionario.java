package entidade;

public class Funcionario {
	
	private Integer codigo;
	private String nome;
	private String sexo;
	private Double salario;
		 
	private Endereco endereco;	
	
	public Funcionario() {
		salario = 700.;			
		
	}		
	
	public Funcionario(Integer codigo, String nome, String sexo,
			Double salario) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.sexo = sexo;
		this.salario = salario;		
	}
	
	@Override
	public String toString() {
		return "Funcionario [codigo=" + codigo + ", nome=" + nome + ", sexo="
				+ sexo + ", salario=" + salario + "]";
	}


	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
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

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	
	
	
}
