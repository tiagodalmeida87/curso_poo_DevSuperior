package exercEstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class ExercFixacaoFinalSoma {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Double valorx, valory, soma;
		
		System.out.print("Digite o valor de X: ");
		valorx = sc.nextDouble();
		
		System.out.print("Digite o valor de Y: ");
		valory = sc.nextDouble();
		
		soma = valorx + valory; 
		System.out.printf("Soma = %.2f\n", soma);
		
		sc.close();
		
	}

}
