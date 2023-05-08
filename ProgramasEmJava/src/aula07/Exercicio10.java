package aula07;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do seu salario atual: ");
		double salarioInic = sc.nextDouble();
		System.out.println("Valor do salario sem ajuste: " + salarioInic );
		
		double salarioComAjuste = 0;
		double salarioFinal = 0;
		
		if (salarioInic <= 280) {
			salarioComAjuste = salarioInic * 0.20;
			salarioFinal = salarioComAjuste + salarioInic;
			System.out.println("o aumento foi de 20% " + "\nO salario com ajuste/aumento eh: " + salarioFinal);
		} else {
			if (salarioInic > 280 && salarioInic <= 700) {
				salarioComAjuste = salarioInic * 0.15;
				salarioFinal = salarioComAjuste + salarioInic;
				System.out.println("o aumento foi de 15% " + "O salario com ajuste/aumento eh: " + salarioFinal);
			} if (salarioInic > 700 && salarioInic <= 1500) {
			salarioComAjuste = salarioInic * 0.10;
			salarioFinal = salarioComAjuste + salarioInic;
			System.out.println("o aumento foi de 10% " + "O salario com ajuste/aumento eh: " + salarioFinal);
			} if (salarioInic > 1500) {
				salarioComAjuste = salarioInic * 0.5;
				salarioFinal = salarioComAjuste + salarioInic;
				System.out.println("o aumento foi de 5% " + "O salario com ajuste/aumento eh: " + salarioFinal);	
			}
				
			}
		sc.close();
		}	

	}


