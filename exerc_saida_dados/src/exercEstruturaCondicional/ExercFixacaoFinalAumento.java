package exercEstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class ExercFixacaoFinalAumento {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Double salario, novoSalario, diferenca;

		System.out.print("Digite o salario da pessoa: ");
		salario = sc.nextDouble();

		// diferenca = 0.0;
		if (salario <= 1000) {
			novoSalario = salario * 1.2;
			System.out.printf("Novo salario = R$ %.2f\n", novoSalario);
			diferenca = novoSalario - salario;
			System.out.printf("Aumento = R$ %.2f\n", diferenca);
			System.out.println("Porcentagem = 20%");
		} else if (salario > 1000 && salario <= 3000) {
			novoSalario = salario * 1.15;
			System.out.printf("Novo salario = R$ %.2f\n", novoSalario);
			diferenca = novoSalario - salario;
			System.out.printf("Aumento = R$ %.2f\n", diferenca);
			System.out.println("Porcentagem = 15%");
		} else if (salario > 3000 && salario <= 8000) {
			novoSalario = salario * 1.1;
			System.out.printf("Novo salario = R$ %.2f\n", novoSalario);
			diferenca = novoSalario - salario;
			System.out.printf("Aumento = R$ %.2f\n", diferenca);
			System.out.println("Porcentagem = 10%");
		} else if (salario > 8000) {
			novoSalario = salario * 1.05;
			System.out.printf("Novo salario = R$ %.2f\n", novoSalario);
			diferenca = novoSalario - salario;
			System.out.printf("Aumento = R$ %.2f\n", diferenca);
			System.out.println("Porcentagem = 5%");
		}

		sc.close();

	}

	
	
}
