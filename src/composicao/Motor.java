package composicao;

public class Motor {

	private Integer codigoMotor;
	private String tipoCombustivel;
	private Double potencia;
	private Integer cavalos;

	public Motor() {
		// TODO Auto-generated constructor stub
	}

	public Motor(Integer codigoMotor, String tipoCombustivel, Double potencia,
			Integer cavalos) {
		super();
		this.codigoMotor = codigoMotor;
		this.tipoCombustivel = tipoCombustivel;
		this.potencia = potencia;
		this.cavalos = cavalos;
	}

	@Override
	public String toString() {
		return "Motor [codigoMotor=" + codigoMotor + ", tipoCombustivel="
				+ tipoCombustivel + ", potencia=" + potencia + ", cavalos="
				+ cavalos + "]";
	}

	public Integer getCodigoMotor() {
		return codigoMotor;
	}

	public void setCodigoMotor(Integer codigoMotor) {
		this.codigoMotor = codigoMotor;
	}

	public String getTipoCombustivel() {
		return tipoCombustivel;
	}

	public void setTipoCombustivel(String tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}

	public Double getPotencia() {
		return potencia;
	}

	public void setPotencia(Double potencia) {
		this.potencia = potencia;
	}

	public Integer getCavalos() {
		return cavalos;
	}

	public void setCavalos(Integer cavalos) {
		this.cavalos = cavalos;
	}

}
