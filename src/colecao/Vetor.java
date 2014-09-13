package colecao;

public class Vetor {
	
	public static void main(String[] args) {
		
		String nomes[] = new String[4];
		Integer[] numeros = new Integer[5];
		
		
		nomes[0] = "Beto";
		nomes[1] = "Rita";
		nomes[2] = "Mila";
		nomes[3] = "João";
		
		for (int i = 0; i < 5; i++){
			numeros[i] = (i + 10) * 6;			
		}
		
		for (int i = 0; i < nomes.length; i++){
			System.out.println("Posição " + i +", nome: " + nomes[i]);
			
		}
		
		for (Integer num : numeros){
			
			System.out.println("Valor: "+ num);
			System.out.println(numeros);
		}
		
	}

}
