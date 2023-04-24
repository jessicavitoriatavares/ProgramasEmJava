package aula07;
import java.util.Scanner; 

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escolha a operacao: + - * / ");
		String operacao = sc.nextLine();
		System.out.println("Digite um numero ");
		double num = sc.nextDouble();
		System.out.println("Digite outro numero ");
		double num2 = sc.nextDouble();
		
		double soma = num + num2;
		double subtracao = num - num2;
		double multiplicacao = num * num2;
		double divisao = num / num2;

		switch (operacao) {
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
