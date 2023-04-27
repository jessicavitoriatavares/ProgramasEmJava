package aula06;

import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int anos = sc.nextInt();
		int meses = sc.nextInt();
		int dias = sc.nextInt();
		
		int qntDias = (anos * 365) + (meses * 30) + dias;
		
		System.out.println("Quantidade de dias vividos: 0" + qntDias);
		

	}

}
