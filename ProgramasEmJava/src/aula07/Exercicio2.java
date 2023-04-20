package aula07;
import java.util.Scanner; 

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		System.out.println("Digite um numero");
		int num = sc.nextInt();
		System.out.println("Digite outro numero");
		int segNum = sc.nextInt();
		
		if (num == segNum) {
			System.out.println("Os numeros sao iguais. Logo, nao tem um maior.");
		}
		else { 
			if (num > segNum) {
				System.out.println("o " + num + " eh maior");
			} else {
				System.out.println("o " + segNum + " eh maior");
			}
			
		}
		
		sc.close();
	}

}
