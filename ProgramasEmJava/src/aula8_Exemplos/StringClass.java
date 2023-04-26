package aula8_Exemplos;

public class StringClass {

	public static void main(String[] args) {
		
		// percorrendo uma String
		
		String str = "FiIAP Paulista Legal";
		
		int tamanhoStr = str.length();
		System.out.println("Tamanho da str: " + tamanhoStr);
		
		for (int i = 0; i < tamanhoStr; i++) {
			System.out.println(str.charAt(i));
		}

	}

}
