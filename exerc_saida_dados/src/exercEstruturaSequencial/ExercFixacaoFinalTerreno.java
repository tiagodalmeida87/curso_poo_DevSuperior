package exercEstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class ExercFixacaoFinalTerreno {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Double larguraTerreno, comprimentoTerreno, valor, area, preco;

		System.out.print("Digite a largura do terreno: ");
		larguraTerreno = sc.nextDouble();

		System.out.print("Digite o comprimento do terreno: ");
		comprimentoTerreno = sc.nextDouble();

		System.out.print("Digite o valor do metro quadrado: $ ");
		valor = sc.nextDouble();

		area = larguraTerreno * comprimentoTerreno;
		System.out.printf("Area do terreno: %.2f%n", area);

		preco = area * valor;
		System.out.printf("Preço do terreno: %.2f", preco);

		sc.close();
	}
}
