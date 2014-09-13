package execucao;

import composicao.Carro;

public class MainCarro {
	
	public static void main(String[] args) {
		
		Carro c1 = new Carro();
		c1.setModelo("Civic");
		c1.setCor("Branco");
		c1.setPreco(86000.);
		c1.getMotor().setCodigoMotor(1103);
		c1.getMotor().setTipoCombustivel("Gasolina");
		c1.getMotor().setCavalos(160);
		c1.getMotor().setPotencia(2.2);
		
		Carro c2 = new Carro("Palio", "preto", 32000.);
		c2.getMotor().setCodigoMotor(4011);
		c2.getMotor().setTipoCombustivel("Gasolina / Etanol");
		c2.getMotor().setCavalos(75);
		c2.getMotor().setPotencia(1.0);
		
		System.out.println(c1);
		System.out.println(c2);
	}

}
