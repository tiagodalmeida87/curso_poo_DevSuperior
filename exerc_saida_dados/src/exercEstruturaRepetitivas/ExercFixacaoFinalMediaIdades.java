package exercEstruturaRepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class ExercFixacaoFinalMediaIdades {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int idade, npessoas;
		double soma, media;

		System.out.println("Digite as idades: ");
		idade = sc.nextInt();

		if (idade < 0) {
			System.out.println("Impossível Calcular");
		} else {
			soma = 0;
			npessoas = 0;

			while (idade >= 0) {
				soma += idade;
				npessoas++;
				idade = sc.nextInt();
			}

			media = soma / npessoas;

			System.out.printf("Media = %.2f\n", media);
		}

		sc.close();
	}

}
