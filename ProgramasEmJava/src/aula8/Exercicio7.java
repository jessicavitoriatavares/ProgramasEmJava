package aula8;
import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a media da sala: ");
		double media = sc.nextDouble();
		int alunosNaMedia = 0;
		int alunosForaDaMedia = 0;
		
		
		for (int i = 1; i <= 20; i++) {
			System.out.println("Digite as notas de cada aluno");
			double nota = sc.nextDouble();
			
			if (nota >= media) {
				alunosNaMedia++;
				System.out.println("O total de alunos na media eh: " + alunosNaMedia);	
			} else {
				alunosForaDaMedia++;
				System.out.println("o total de alunos fora da media: " + alunosForaDaMedia);
			}
		}
		sc.close();

	}

}
