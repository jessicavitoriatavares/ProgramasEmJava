package aula10_exemplosMetodos;

import java.util.Scanner;

public class MetodosComArg {
	
	static void saudacaoComArg(String nome, int idade ) {
		
		if (idade >= 18) {
			System.out.printf("Ola %s! Voce tem %D anos e eh maior de idade", nome, idade);
		} else {
			System.out.printf("Ola %s! Voce tem %D anos e eh menor de idade\n", nome, idade);
		}
	}

	public static void main(String[] args) {
		
		//metodos sem retorno com argumentos/parametros
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("digite o seu nome: ");
		String nomeDig = sc.nextLine();
		
		System.out.println("digite sua idade: ");
		int idadeDig = sc.nextInt();
		
		saudacaoComArg(nomeDig, idadeDig);
		
		sc.close();
	}

}
