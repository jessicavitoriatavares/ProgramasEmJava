package aula07;
import java.util.Scanner; 

public class Exercicio9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o tipo do cliente");
		String tipoCliente = sc.nextLine();
		System.out.println("Informe a quantidade de KW/h que foram gastos");
		double qntKw = sc.nextDouble();
		
		double residencia = 0.60 * qntKw;
		double comercio = 0.40 * qntKw;
		double industria = 1.29 * qntKw;

		switch (tipoCliente) {
		case "residencia":
			System.out.println("o valor da conta de luz é " + residencia);
			break;
		case "comercio":
			System.out.println("o valor da conta de luz eh: " + comercio);
			break;
		case "industria":
			System.out.println("o valor da conta de luz eh: " + industria);
			break;		
		default:
			System.out.println("Erro!! digite um tipo de cliente valido");
		
		sc.close();
		
	}
		
	}

}
