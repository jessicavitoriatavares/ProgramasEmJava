package aula06;

public class Exercicio2 {

	public static void main(String[] args) {
		
		int num1 = 2;
		float num2 = 10.5f;
		double num3 = 5.5;
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		
		String str = Double.toString(num3);
		String strr = Float.toString(num2);
		String sttr = Integer.toString(num1);
		
		System.out.println(str);
		System.out.println(strr);
		System.out.println(sttr);

	}

}

// pintf --- formatar as casas decimais desejadas
// "%.2f" -- deixa com duas casas decimais