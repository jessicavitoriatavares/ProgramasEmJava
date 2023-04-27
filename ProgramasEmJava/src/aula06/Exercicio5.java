package aula06;
import java.util.Scanner; 

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor da primeira nota;");
		double n1 = sc.nextDouble();
		
		System.out.println("digite o valor da segunda nota");
		double n2 = sc.nextDouble();
		
		double MediaPonderada = (n1 * 0.4) + (n2 * 0.6);
		
		System.out.println("a media ponderada do aluno eh: " + MediaPonderada);
		
	}

}
