package aula8;
import java.util.Scanner; 

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
	
	  String escolha = "sim";
	  
	  while (escolha.equals("sim")) {
		  System.out.println("Ola, mundo");
		  
		  System.out.print("Voce quer ver a mensagem novamente?");
		  
		  escolha = sc.nextLine();
	  }
	  System.out.println("Fim!");
	  sc.close();

	}

}
