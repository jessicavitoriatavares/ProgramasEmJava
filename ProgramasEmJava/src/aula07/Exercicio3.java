package aula07;
import java.util.Scanner; 

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Digite a primeira nota do aluno: ");
		double nota1 = sc.nextDouble();
		System.out.println("Digite a segunda nota do aluno: ");
		double nota2 = sc.nextDouble();
		System.out.println("Digite a terceira nota do aluno: ");
		double nota3 = sc.nextDouble();
		System.out.println("Digite a quarta nota do aluno: ");
		double nota4 = sc.nextDouble();
		
		double notaFinal = (nota1 + nota2 + nota3 + nota4) / 4;
		
		if (notaFinal >= 7) {
			System.out.println("Aprovado!");
		} else {
			if (5 <= notaFinal || notaFinal < 7) { 
				System.out.println("Em Recuperacao");			
			} else {
				System.out.println("Reprovado");
			}
		}
		
		sc.close();	
	}

}
