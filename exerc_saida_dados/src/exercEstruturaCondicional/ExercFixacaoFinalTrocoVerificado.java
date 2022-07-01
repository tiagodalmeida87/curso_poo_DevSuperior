package exercEstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class ExercFixacaoFinalTrocoVerificado {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Double preco, valor, total, troco, falta;
		int quantidade;
		
		System.out.print("Preço unitário do produto: ");
		preco = sc.nextDouble();
		
		System.out.print("Quantidade comprada: ");
		quantidade = sc.nextInt();
		
		System.out.print("Dinheiro paga pelo cliente R$ ");
		valor = sc.nextDouble();
		
		total = preco * quantidade; 
		
		if (total < valor) {
			troco = valor - total;
			System.out.printf("Seu troco é R$ %.2f Reais", troco);
		} else if (valor < total) {
			falta = total - valor;
			System.out.printf("Dinehiro insuficiente, falta R$ %.2f Reais", falta);
		}
		
		sc.close();
	}

}
