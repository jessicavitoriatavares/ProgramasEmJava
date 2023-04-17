package Exercicio1;
import java.util.Scanner;


public class Exercicio2 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("digite quantos metros o inimigo esta");
		int metrosDeDistancia = sc.nextInt();
		
		if ( metrosDeDistancia >= 70 ) {
			System.out.println("DESATIVADO!");
		}
		else {
			System.out.println("ATIVADO!");
		}
		
        sc.close();
	}

}
