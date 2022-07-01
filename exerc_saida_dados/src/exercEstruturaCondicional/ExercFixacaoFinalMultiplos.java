package exercEstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class ExercFixacaoFinalMultiplos {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n1,n2;
		
		System.out.println("Digite dois numeros inteiros: ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		if (n1 % n2 == 0 || n2 % n1 == 0) {
			System.out.println("S�o multiplos");
		} else {
			System.out.println("N�o s�o multiplos");
		}

		sc.close();
	}

}
