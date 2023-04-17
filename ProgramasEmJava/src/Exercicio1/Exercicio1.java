package Exercicio1;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Ola, digite um numero inteiro: ");
		int num = sc.nextInt();
		
		int sucessor = num + 1;
		
		int antecessor = num - 1;
		
		int dobro = num * 2;
		
		int metade = num / 2;
		
		System.out.println("O número digitado foi: " + num + "\n"
				+ "O seu sucessor eh: " + sucessor + "\n"
				+ "O seu antecessor eh: " + antecessor + "\n"
				+ "O dobro do número eh: " + dobro + "\n"
				+ "A metade eh: " + metade);
	

	}

}
