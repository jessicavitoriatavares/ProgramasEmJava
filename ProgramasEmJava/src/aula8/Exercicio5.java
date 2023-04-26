package aula8;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double maior = 0;
		
	
		for (int i = 1; i <= 12; i++) {
			System.out.println("Digite 12 numeros");
			double num = sc.nextDouble();
			
			if (num > maior) {
			maior = num ;
			}	
		}
		
		System.out.println("o numero maior eh: " + maior);
		sc.close();


	}

}
