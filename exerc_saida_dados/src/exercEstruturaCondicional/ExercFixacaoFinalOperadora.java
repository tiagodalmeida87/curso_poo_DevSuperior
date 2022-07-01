package exercEstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class ExercFixacaoFinalOperadora {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos minutos foram utilizados no mês?");
		int minutos = sc.nextInt();

		double conta = 50.0;
		if (minutos > 100) {
			conta += (minutos - 100) * 2;
		}

		System.out.printf("Valor total da conta: R$ %.2f\n", conta);

		sc.close();
	}

}
