package aula07;
import java.util.Scanner; 

public class Exercicio9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o tipo do cliente");
		String tipoCliente = sc.nextLine();
		
		double  = num + num2;
		double subtracao = num - num2;
		double multiplicacao = num * num2;
		double divisao = num / num2;

		switch (tipoCliente) {
		case "+":
			System.out.println("o resultado da soma eh: " + soma);
			break;
		case "-":
			System.out.println("o resultado da subtracao eh: " + subtracao);
			break;
		case "*":
			System.out.println("o resultado da multiplicacao eh: " + multiplicacao);
			break;	
		case "/":
			System.out.println("o resultado da divisao eh: " + divisao);
			break;		
		default:
			System.out.println("Erro");
		
		sc.close();
		
	}
		
	}

}
