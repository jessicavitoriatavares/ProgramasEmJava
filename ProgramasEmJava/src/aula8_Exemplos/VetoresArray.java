package aula8_Exemplos;

public class VetoresArray {

	public static void main(String[] args) {
	
		String[] listaFrutas = new String[4];
		listaFrutas[0] = "Morango";
		listaFrutas[1] = "Kiwi";
		listaFrutas[2] = "Limao";
		listaFrutas[3] = "Abacaxi";
		
		System.out.println("Fruta 1: " + listaFrutas[0] + "\nFruta 2: " + listaFrutas[1] + "\nFruta 2: " + listaFrutas[2] + "\nFruta 3: " + listaFrutas[3] );
		
		String[] listaFrutas2 = {"Manga", "Jaca", "Tangerina", "Laranja"};
		
		int quantidadeDeFrutas = listaFrutas2.length;
		System.out.println(quantidadeDeFrutas);
		
		for (int i = 0; i < quantidadeDeFrutas; i++);
		System.out.println(listaFrutas2[1]);
		
		
	}

}
