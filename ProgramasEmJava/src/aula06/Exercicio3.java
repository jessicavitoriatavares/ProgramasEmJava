package aula06;
import java.util.Scanner; 

public class Exercicio3 {

	public static void main(String[] args) {
		
		System.out.println("digite o seu nome");
		
		Scanner sc = new Scanner(System.in);
		String nome = sc.nextLine();
		
		System.out.println("Escolha seu genero: \n[M] Masculino \n[F] Feminino \n[O] Outro \n[N] Nao Responder");
		char genero = sc.nextLine().charAt(0);
		

		System.out.println("ola, " + nome + ". Voce escolheu o seguinte genero: " + genero);
		
		

	}

}
