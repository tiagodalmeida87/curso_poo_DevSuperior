package exercEstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class ExercFixacaoFinalConsumo {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Double distancia, combustivel, media;
		
		System.out.print("Distância percorrida: ");
		distancia = sc.nextDouble();
		
		System.out.printf("Combustível gasto: " );
		combustivel = sc.nextDouble();
		
		media = distancia / combustivel;
		
		System.out.printf("Consumo médio de combustivel pela distância = %.3f", media);
		
		sc.close();
	}

}
