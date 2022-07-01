package exercEstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class ExercFixacaoFinalNotas {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Double nota1, nota2, total;

		System.out.print("Digite a primeira nota: ");
		nota1 = sc.nextDouble();

		System.out.print("Digite a segunda nota: ");
		nota2 = sc.nextDouble();

		total = nota1 + nota2;
		System.out.printf("NOTA FINAL: %.1f\n", total);

		if (total < 60) {
			System.out.println("REPROVADO");
		} else {
			System.out.println("APROVADO");
		}
		sc.close();
	}

}
