package Atividades2;

import java.util.Scanner;

public class Entre100While {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero, contador = 0, i = 0;

		while (i < 20) {
			System.out.print("Informe um número: ");
			numero = ler.nextInt();
			
			if (numero >= 0 && numero <= 100) {
				contador++;
			}
			i++;
		}
		System.out.println("Quantidade de números entre 0 e 100: " + contador);
	}
}
