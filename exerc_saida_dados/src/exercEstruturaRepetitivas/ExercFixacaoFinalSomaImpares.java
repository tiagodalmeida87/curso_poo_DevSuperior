package exercEstruturaRepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class ExercFixacaoFinalSomaImpares {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x, y, soma, troca;

		System.out.println("Digite dois números: ");
		x = sc.nextInt();
		y = sc.nextInt();

		if (x > y) {
			troca = x;
			x = y;
			y = troca;
		}

		soma = 0;
		for (int i = x; i < y; i++) {
			if (i % 2 != 0) {
				soma = soma + i;
			}
		}

		System.out.printf("Soma dos impares = %d\n", soma);

		sc.close();

	}

}
