package aula11_exemplos;

public class MetodoComRetorno {
	
	static int somar (int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		
		int valorSoma = somar(2, 100);
		
		System.out.println(somar(3,8));
	}

}
