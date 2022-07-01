package exercEstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class ExercFixacaoFinalLanchonete {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int produto, quantidade;
		Double preco;
		
		System.out.print("Código do produto comprado: ");
		produto = sc.nextInt();
		
		System.out.print("Quantidade comprada: ");
		quantidade = sc.nextInt();
		
		preco = 0.0;
		if (produto == 1) {
			preco = quantidade * 5.00;
		} else if (produto == 2) {
			preco = quantidade * 3.50;
		} else if (produto == 3) {
			preco = quantidade * 4.80;
		} else if (produto == 4) {
			preco = quantidade * 8.90;
		} else if (produto == 5) {
			preco = quantidade * 7.32;
		}
		
		System.out.printf("Valor a pagar: R$ %.2f\n", preco);
		
		sc.close();
	}

}
