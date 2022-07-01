package exercEstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class ExercFixacaoFinalIdade {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String pessoa1, pessoa2;
		int idade1, idade2;
		Double media;
		
		System.out.println("Dados da primeira pessoa: ");
		System.out.print("Nome: ");
		pessoa1 = sc.nextLine();
		System.out.print("Idade: ");
		idade1 = sc.nextInt();
		
		System.out.println();
		
		System.out.println("Dados da segunda pessoa: ");
		System.out.print("Nome: ");
		sc.nextLine();
		pessoa2 = sc.nextLine();
		System.out.print("Idade: ");
		idade2 = sc.nextInt();
		
		System.out.println();
		media = (idade1 + idade2) / 2.0;
		System.out.printf("A idade média de %s e %s é de %.1f anos.", pessoa1, pessoa2, media);
		
		sc.close();

	}

}
