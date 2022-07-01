package exercEstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class ExercFixacaoFinalTempoJogo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int hinicial, hfinal;

		System.out.print("Hora incial: ");
		hinicial = sc.nextInt();

		System.out.print("Hora Final: ");
		hfinal = sc.nextInt();

		if (hinicial < hfinal) {
			System.out.printf("O jogo durou %d Hora(s)\n", hfinal - hinicial);
		} else {
			System.out.printf("O jogo durou %d Hora(s)\n", 24 - (hinicial - hfinal));
		}

		sc.close();
	}

}
