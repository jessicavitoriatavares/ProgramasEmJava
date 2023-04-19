package aula06;
import java.util.Scanner; 

public class Exercicio6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o nome da peca: ");
		String nomePeca = sc.nextLine();
		
		System.out.println("Digite a quantidade de pecas: ");
		int qntPecas =  Integer.parseInt(sc.nextLine());
		
		System.out.println("Digite o valor da peca unitario: ");
		double valorUni = sc.nextDouble();
		
		double valorFinal = qntPecas * valorUni;
		System.out.println("O valor de " + qntPecas + " " + nomePeca + " eh " + valorFinal);
		
		System.out.println("Digite o nome da segunda peca: ");
		String peca2 = sc.nextLine();
		
		System.out.println("Digite a quantidade de pecas: ");
		int qntPecas2 =  Integer.parseInt(sc.nextLine());
		
		System.out.println("Digite o valor da peca unitario: ");
		double valorUni2 = sc.nextDouble();
		
		double valorFinal2 = qntPecas2 * valorUni2;
		System.out.println("O valor da segunda peca " + qntPecas + " " + peca2 + " eh " + valorFinal);
		
		double total = valorFinal + valorFinal2;
		System.out.println("O valor total a ser pago eh " + total);
		
		
		
	}

}
