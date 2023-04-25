package aula8;
import java.util.Scanner; 

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Digite o numero que vc eseja saber a tabuada : ");
		int num = sc.nextInt();
		
		for (int i = 0; i <= 25; i++) {
			System.out.println( num + "x" + i + "=" + (num * i ));
		}

		
		

	}

}
