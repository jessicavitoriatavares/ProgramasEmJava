package exerciciosAula05;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
	
		float preco = 10.99f;
		float preco2 = (float) 12.90; //Type Cast
		
		System.out.println("float 1: " + preco);
		System.out.println("float 2: " + preco2);
		
		int precoInteiro = (int) 2.50; //Type Cast 
		System.out.println("Valor  inteiro: " + precoInteiro);
		
		int numeroX = 6;
		double numeroXDouble = numeroX;
		System.out.println("");
		System.out.println(numeroX);
		System.out.println(numeroXDouble);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" ");
		System.out.println("digite um nuemro: ");
		int numeroIn = (int) sc.nextDouble();
		
		System.out.println(numeroIn);
		
		  sc.close();

	}

}
