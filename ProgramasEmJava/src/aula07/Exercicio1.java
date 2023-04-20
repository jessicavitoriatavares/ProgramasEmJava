package aula07;
import java.util.Scanner; 

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Digite um numero inteiro");
		int num = sc.nextInt();
		
		
		if (num % 2 == 0) {
			System.out.println("Esse numero eh par");
		} else {
			System.out.println("Esse numero eh impar");
		}
		
		
	}

}
