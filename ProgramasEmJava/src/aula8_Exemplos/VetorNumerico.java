package aula8_Exemplos;

public class VetorNumerico {

	public static void main(String[] args) {
	
		int[] numeros = {0, 5, 20, 30};

		// for indexado
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.printf("Posicao: %d --- Valor: %d \n", i, numeros[i]);
			
			//para usar o %d tem que usar o "printf" 
		}
	}

}
