package exercEstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class ExercFixacaoFinalMenor_Tres {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int num1, num2, num3;
		
		System.out.print("Primeiro valor: ");
		num1 = sc.nextInt();
		System.out.print("Segundo valor: ");
		num2 = sc.nextInt();
		System.out.print("Terceiro valor: ");
		num3 = sc.nextInt();
		
		if (num1 <= num2 && num1 <= num3 ) {
			System.out.println("Menor: " + num1);
		} else if (num2 <= num1 && num2 <= num3){
			System.out.println("Menor: " + num2);
		} else if (num3 <= num1 && num3 <= num2){
			System.out.println("Menor: " + num3);
		}
		
		sc.close();
	}

}
