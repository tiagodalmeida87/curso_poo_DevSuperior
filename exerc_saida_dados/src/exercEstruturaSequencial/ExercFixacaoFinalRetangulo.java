package exercEstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class ExercFixacaoFinalRetangulo {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Double base, altura, area, perimetro, diagonal;

		System.out.print("Digite o valor da base do Retangulo: ");
		base = sc.nextDouble();

		System.out.print("Digite o valor da altura do Retangulo: ");
		altura = sc.nextDouble();

		area = base * altura;
		System.out.printf("Area = %.4f\n", area);

		perimetro = 2.0 * (base + altura);
		System.out.printf("Perimetro = %.4f\n", perimetro);

		diagonal = Math.sqrt(Math.pow(base, 2.0) + Math.pow(altura, 2.0));
		System.out.printf("Diagonal = %.4f\n", diagonal);

		sc.close();
	}

}
