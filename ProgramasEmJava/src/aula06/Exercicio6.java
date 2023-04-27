package aula06;
import java.util.Scanner; 

public class Exercicio6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o nome da peca1: ");
		String nomePeca1 = sc.nextLine();
		
		System.out.println("Digite a quantidade de pecas: ");
		int qntPecas =  Integer.parseInt(sc.nextLine());
		
		System.out.println("Digite o valor unitario da peca1: ");
		double valorUni = Double.parseDouble(sc.nextLine());
		
		double valorFinal = qntPecas * valorUni;
		System.out.println("O valor de " + qntPecas + " " + nomePeca1 + " eh " + valorFinal);
		
		System.out.println("Digite o nome da segunda peca: ");
		String peca2 = sc.nextLine();
		
		System.out.println("Digite a quantidade de pecas: ");
		int qntPecas2 =  Integer.parseInt(sc.nextLine());
		
		System.out.println("Digite o valor da peca unitario: ");
		double valorUni2 = Double.parseDouble(sc.nextLine());
		
		double valorFinal2 = qntPecas2 * valorUni2;
		System.out.println("O valor da segunda peca " + qntPecas2 + " " + peca2 + " eh " + valorFinal2);
		
		double total = valorFinal + valorFinal2;
		System.out.println("O valor total a ser pago eh " + total);
		
		
		
	}

}
