package exercicios;

import java.util.Scanner;

public class Exercico3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("digite seu nome:");
		
		String nome = sc.nextLine();
		int idade = sc.nextInt();
		
		System.out.println("Ola, " + nome + " voce tem " + idade + " anos ");
		
		  sc.close();

	}

}
