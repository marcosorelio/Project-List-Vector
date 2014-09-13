package composicao;

public class Carro {
	
	private String modelo;
	private String cor;
	private Double preco;
	
	private Motor motor;
	
	public Carro() {
		motor = new Motor();
		
	}

	public Carro(String modelo, String cor, Double preco) {
		
		this.modelo = modelo;
		this.cor = cor;
		this.preco = preco;
		this.motor = new Motor();
	}

	@Override
	public String toString() {
		return "Carro [modelo=" + modelo + ", cor=" + cor + ", preco=" + preco
				+ ", motor=" + motor + "]";
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	
	

}
