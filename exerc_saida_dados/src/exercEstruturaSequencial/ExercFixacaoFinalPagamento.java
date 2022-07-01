package exercEstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class ExercFixacaoFinalPagamento {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		String nome;
		Double valorHora, horas, pagamento;

		System.out.print("Nome do Funcionário: ");
		nome = sc.nextLine();

		System.out.print("Valor por hora: ");
		valorHora = sc.nextDouble();

		System.out.print("Horas trabalhada(s): ");
		horas = sc.nextDouble();

		pagamento = valorHora * horas;
		System.out.printf("O pagamento para %s deve ser %.2f", nome, pagamento);

		sc.close();
	}

}
