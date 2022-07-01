package exercEstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class ExercFixacaoFinalBaskara {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Double coea, coeb, coec, delta, x1, x2;
		
		System.out.print("Coeficiente a: ");
		coea = sc.nextDouble();
		System.out.print("Coeficiente b: ");
		coeb = sc.nextDouble();
		System.out.print("Coeficiente c: ");
		coec = sc.nextDouble();
		
		delta = (coeb * coeb) - 4 * coea * coec;
		
		x1 = (-coeb + Math.sqrt(delta)) / 2 * coea;
		x2 = (-coeb - Math.sqrt(delta)) / 2 * coea;
		
		System.out.printf("X1 = %.4f\n", x1);
		System.out.printf("X2 = %.4f\n", x2);
		
		
		
		sc.close();
		
	}

}
