package aula07;
import java.util.Scanner; 


public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro");
		int num = sc.nextInt();
		System.out.println("Digite outro numero inteiro");
		int num2 = sc.nextInt();
		
		
		if ( num % num2 == 0 || num2 % num == 0) {
			System.out.println("Os numeros sao multiplos");
		} else {
			System.out.println("Os numeros nao sao multiplos");
		}
		sc.close();
		
	}

}
