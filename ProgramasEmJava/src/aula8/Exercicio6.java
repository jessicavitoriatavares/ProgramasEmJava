package aula8;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um valor inteiro positivo: ");
		int qntd = sc.nextInt();
		System.out.print("Valores pares entre 2 e " + qntd + ": ");
		for (int i = 2; i <= qntd; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		sc.close();
	}

}
