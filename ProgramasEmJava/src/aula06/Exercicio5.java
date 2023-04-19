package aula06;
import java.util.Scanner; 

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor da primeira nota;");
		double n1 = sc.nextDouble();
		
		System.out.println("digite o valor da segunda nota");
		double n2 = sc.nextDouble();
		
		int p1 = 4;
		int p2 = 6;
		
		double MediaPonderada = ((n1 * p1) + (n2 * p2)) / 4;
		
		System.out.println("a media ponderada do aluno eh: " + MediaPonderada);
		
	}

}
