package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class StudentExercise {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Student estud = new Student();

		System.out.print("Name student: ");
		estud.name = sc.nextLine();

		System.out.println("Digite as 3 Notas: ");
		estud.n1 = sc.nextDouble();
		estud.n2 = sc.nextDouble();
		estud.n3 = sc.nextDouble();
		
		System.out.printf("Nota final: %.2f\n", estud.notaFinal());
		
		if(estud.notaFinal() < 60.0) {
			System.out.println("Reprovado");
			System.out.printf("Faltam %.2f Ponto(s)\n", estud.contagemNota());
		} else {
			System.out.println("Aprovado");
		}

		sc.close();
	}

}
