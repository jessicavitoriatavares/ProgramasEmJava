package aula8;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double soma = 0;
	
		for (int i = 1; i <= 10; i++) {
			System.out.println("Digite 10 numeros");
			double num = sc.nextDouble();
			soma += num ;
			
		}
		
		System.out.println(soma);
		sc.close();

	}

}
