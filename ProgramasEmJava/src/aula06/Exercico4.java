package aula06;
import java.util.Scanner; 

public class Exercico4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor da primeira nota;");
		double n1 = sc.nextDouble();
		
		System.out.println("digite o valor da segunda nota");
		double n2 = sc.nextDouble();
		
		double media = (n1 + n2) / 2;
		
		System.out.println("A media ponderada do aluno foi: " + media);
		
	}

}
