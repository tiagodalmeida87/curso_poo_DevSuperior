package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConvert;

public class CotacaoDolarExercise {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.print("What is the dollar price? ");
		double dollarPrice = sc.nextDouble();

		System.out.print("How many dollars will be bought? ");
		double quant = sc.nextDouble();
		double result = CurrencyConvert.dollarToReal(quant, dollarPrice);

		System.out.printf("Amount to be paid in reais = %.2f\n", result);

		sc.close();
	}

}