package aula8;
import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a media da sala: ");
		int media = sc.nextInt();
		
		for (int i = 1; i <= 20; i++) {
			System.out.println("Digite as notas de cada aluno");
			double nota = sc.nextDouble();
			
			if (nota >= media) {
				
			}
			


		}
		sc.close();

	}

}
