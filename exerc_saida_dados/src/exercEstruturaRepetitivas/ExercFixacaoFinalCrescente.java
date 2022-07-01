package exercEstruturaRepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class ExercFixacaoFinalCrescente {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int x, y;

		System.out.println("Digite dois n�meoros: ");
		x = sc.nextInt();
		y = sc.nextInt();

		while (x != y) {
			if (x > y) {
				System.out.println("Decrescente");
			} else {
				System.out.println("Crescente");
			}

			System.out.println("Digite outros dois n�meros: ");
			x = sc.nextInt();
			y = sc.nextInt();
		}

		sc.close();
	}

}
