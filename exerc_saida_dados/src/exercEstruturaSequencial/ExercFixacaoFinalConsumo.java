package exercEstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class ExercFixacaoFinalConsumo {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Double distancia, combustivel, media;
		
		System.out.print("Dist�ncia percorrida: ");
		distancia = sc.nextDouble();
		
		System.out.printf("Combust�vel gasto: " );
		combustivel = sc.nextDouble();
		
		media = distancia / combustivel;
		
		System.out.printf("Consumo m�dio de combustivel pela dist�ncia = %.3f", media);
		
		sc.close();
	}

}
