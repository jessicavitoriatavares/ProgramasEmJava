package aula07;

import java.util.Scanner;

public class Exemplo2 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int n;
		System.out.print("Digite um número: ");
		n = tec.nextInt();
		System.out.println(n + " x 1 = " + (n * 1));
		System.out.println(n + " x 2 = " + (n * 2));
		System.out.println(n + " x 3 = " + (n * 3));
		System.out.println(n + " x 4 = " + (n * 4));
		System.out.println(n + " x 5 = " + (n * 5));

	}
}