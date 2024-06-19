package Atividades2;

import java.util.Scanner;

public class NegativoEncerraWhile {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero, soma = 0;

		while (true) {
			System.out.print("Informe um número(negativo para encerrar): ");
			numero = ler.nextInt();

			if (numero < 0) {
				break; 
			}
			soma += numero; 
		}
		System.out.println("A soma dos números digitados é: " + soma);
	}
}