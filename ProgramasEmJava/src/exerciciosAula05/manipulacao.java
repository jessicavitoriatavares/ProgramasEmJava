package exerciciosAula05;
import java.util.Scanner;

public class manipulacao {

	public static void main(String[] args) {
		
		double salario = 1300.50;
		String salarioSrt = Double.toString(salario); 
		
		System.out.println(salarioSrt.getClass());
		
		System.out.println(" ");
		String idade = "25";
		
		int idadeInt = Integer.parseInt(idade);
		
		System.out.println(idadeInt);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("digite o preco do produto");
		String preco = sc.nextLine();
		
		float precoFloat = Float.parseFloat(preco);
		System.out.println(precoFloat);

	}

}
