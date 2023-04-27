package aula06;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	int idadeEmDias = sc.nextInt();
	
	    int anos = (int) idadeEmDias / 365;
	    System.out.println("idade em anos: " + anos);
	    
	    int restoDias = idadeEmDias % 365;
	    System.out.println(restoDias);
	    
	    int meses = (int) restoDias / 30;
	    System.out.println("Idade em meses: " + meses);
	
		int dias = restoDias % 30;
			System.out.println("Idade em dias: " + dias);
	}

}
