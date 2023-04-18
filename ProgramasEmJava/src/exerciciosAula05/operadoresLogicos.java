package exerciciosAula05;

public class operadoresLogicos {

	public static void main(String[] args) {
		
		boolean verificaEmail = true;
		boolean verificaSenha = true;
		
		boolean logicaE = true && true;
		System.out.println(logicaE);
		
		boolean logicaOU = true || false;
		System.out.println(logicaOU);
		
		boolean negacao = !true;
		System.out.println(negacao);
		
		//operadores de strings
		
		String nome1 = "Jessica"; 
		String nome2 = "Luana";
		String nome3 = new String("Luana");
		
		System.out.println(nome1 == nome2);
		System.out.println(nome1.equals(nome3));

	}

}
