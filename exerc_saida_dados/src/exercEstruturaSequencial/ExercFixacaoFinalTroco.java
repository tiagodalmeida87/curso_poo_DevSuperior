package exercEstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class ExercFixacaoFinalTroco {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		Double preco, quantidade, pagamento, troco;

		System.out.print("Preço Unitário do produto: ");
		preco = sc.nextDouble();

		System.out.print("Quantidade comprada: ");
		quantidade = sc.nextDouble();

		System.out.print("Dinheiro recebido: ");
		pagamento = sc.nextDouble();

		troco = pagamento - (preco * quantidade);
		System.out.printf("Troco = %.2f", troco);

		sc.close();
	}

}
