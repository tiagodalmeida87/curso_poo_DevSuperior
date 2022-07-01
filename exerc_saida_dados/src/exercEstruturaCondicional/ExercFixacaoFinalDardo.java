package exercEstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class ExercFixacaoFinalDardo {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Double distancia1, distancia2, distancia3, maior;

		System.out.println("Digite as tr�s dist�ncias: ");
		distancia1 = sc.nextDouble();
		distancia2 = sc.nextDouble();
		distancia3 = sc.nextDouble();

		if (distancia1 > distancia2 && distancia1 > distancia3) {
			maior = distancia1;
		} else if (distancia2 > distancia1 && distancia2 > distancia3) {
			maior = distancia2;
		} else {
			maior = distancia3;
		}

		System.out.printf("Maior dist�ncia = %.2f\n", maior);

		sc.close();
	}

}
