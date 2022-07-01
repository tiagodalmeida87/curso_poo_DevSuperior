package exercEstruturaRepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class ExercFixacaoFinalTabuada {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n, tabuada;

		System.out.print("Deseja a tabuada de qual valor? ");
		n = sc.nextInt();

		for (int i = 0; i <= 10; i++) {
			tabuada = n * i;
			System.out.printf("%d x %d = %d\n", n, i, tabuada);
		}

		sc.close();
	}

}
