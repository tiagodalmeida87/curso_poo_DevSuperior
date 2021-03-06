package exercEstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class ExercFixacaoFinalTemperatura {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		char escala;
		double tempC, tempF;

		System.out.print("Voc? vai digitar a temperatura em qual escala (C/F)?");
		escala = sc.next().charAt(0);

		if (escala == 'F') {
			System.out.println("Digite a temperatura em Fahrenheit: ");
			tempF = sc.nextDouble();

			tempC = 5.0 / 9.0 * (tempF - 32.0);
			System.out.printf("Temperatura equivalente em Celsius: %.2f\n", tempC);
		} else {
			System.out.print("Digite a temperatura em Celsius: ");
			tempC = sc.nextDouble();

			tempF = tempC * 9.0 / 5.0 + 32.0;
			System.out.printf("Temperatura equivalente em Fahrenheit: %.2f\n", tempF);
		}
		sc.close();
	}

}
