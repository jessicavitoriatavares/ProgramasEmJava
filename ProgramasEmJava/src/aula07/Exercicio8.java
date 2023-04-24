package aula07;
import java.util.Scanner; 

public class Exercicio8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite quantos quilometros foram percorridos: ");
		double distancia = sc.nextDouble();
		System.out.println("Digite quantos litros foram ultilizados no percurso: ");
		double litros = sc.nextDouble();
		
		double consumo = distancia / litros; 
		System.out.println("O consumo do carro foi: " + consumo + "km/L");
		
		if (consumo <= 8 ) {
			System.out.println("Esse carro bebe hein");
			
		} else {
			System.out.println("Autonomia legal");
		}
		
		

	}

}
