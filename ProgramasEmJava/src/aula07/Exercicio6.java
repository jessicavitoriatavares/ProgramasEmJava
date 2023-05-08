package aula07;
import java.util.Scanner; 

public class Exercicio6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o seu ano de nascimento: ");
		int anoNasc = sc.nextInt();
		int idade = 2023 - anoNasc;
		System.out.println("Sua idade eh: " + idade);
		
		if (idade >= 18 && idade <= 70) {
			System.out.println("O voto eh obrigatorio");
		} else {
			if (idade >= 16 && idade < 18 || idade > 70 ) {
				System.out.println("O voto eh opicional");
			} else {
				System.out.println("Nao pode votar");
			}
		}
		sc.close();
	}

}
