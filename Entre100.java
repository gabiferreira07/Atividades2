package Atividades2;

import java.util.Scanner;

public class Entre100 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero, contador = 0;

		for (int i = 0; i < 20; i++) {
			System.out.print("Informe um número: ");
			numero = ler.nextInt();
			if (numero >= 0 && numero <= 100) {
				contador++;
			}
		}
		System.out.println("Quantidade de números entre 0 e 100: " + contador);
	}
}