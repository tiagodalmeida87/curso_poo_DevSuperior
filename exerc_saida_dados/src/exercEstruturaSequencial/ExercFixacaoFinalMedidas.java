package exercEstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class ExercFixacaoFinalMedidas {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		Double medidaa, medidab, medidac, areaQuadrado, areaRetangulo, areaTrapezio;

		System.out.println("Digite a medida A: ");
		medidaa = sc.nextDouble();

		System.out.println("Digite a medida B: ");
		medidab = sc.nextDouble();

		System.out.println("Digite a medida C: ");
		medidac = sc.nextDouble();

		areaQuadrado = medidaa * medidaa;

		areaRetangulo = medidaa * medidab;

		areaTrapezio = (medidaa + medidab)* medidac / 2;

		System.out.printf("Area de Quadrado = %.4f\n", areaQuadrado);
		System.out.printf("Area de Triangulo = %.4f\n", areaRetangulo);
		System.out.printf("Area de Trapezio = %.4f\n", areaTrapezio);

		sc.close();
	}

}
