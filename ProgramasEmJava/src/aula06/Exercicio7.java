package aula06;
import java.util.Scanner; 

public class Exercicio7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do produto:");
		double produto = sc.nextDouble();
		
		System.out.println("Qual foi o valor pago? ");
		double valorPago = sc.nextDouble();
		
	    double troco = valorPago - produto; 
		System.out.println("o troco eh " + troco);
		

	}

}
