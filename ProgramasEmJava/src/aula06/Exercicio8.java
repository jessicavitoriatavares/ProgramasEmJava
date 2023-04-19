package aula06;
import java.util.Scanner; 

public class Exercicio8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor em reais:");
		double valorReais = sc.nextDouble();
		
		double valorD = 5.09;
		double valorDolar = valorReais / valorD;
		
		double valorE = 5.56;
		double valorEuro = valorReais / valorE;
		
		double valorP = 0.023;
		double valorPArg = valorReais * valorP;
		
		double libraE = 6.32;
		double valorEst = valorReais / libraE;
		
		double iene = 0.0377;
		double valorIene = valorReais * iene;
		
			
		System.out.println("Valor em Real :" + valorReais + "\nValor em dolar :" + valorDolar + "\nValor em Euro :" + valorEuro + "\nValor em peso argentino" + valorPArg + "\nValor em Libra Esterlina :" + valorEst + "\nValor em iene :" + valorIene );


	}

}
