package exercEstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class ExercFixacaoFinalCirculo {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Double raio, area;
		
		System.out.print("Digite o valor do raio do circulo: ");
		raio = sc.nextDouble();
		
		area = Math.PI * Math.pow(raio, 2.0);
		System.out.printf("Area = %.3f", area);
		
		
		sc.close();
	}

}
