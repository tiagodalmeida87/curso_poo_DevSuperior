package exercEstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class ExercFixacaoFinalGlicose {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Double medida;

		System.out.print("Digite a medida da Glicose: ");
		medida = sc.nextDouble();

		if (medida < 100) {
			System.out.println("Classificação: Normal");
		} else if (medida >= 100 && medida < 140) {
			System.out.println("Classificação: Elevado");
		} else {
			System.out.println("Classificação: Diabetes");
		}

 		sc.close();
	}

}
