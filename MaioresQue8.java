package Atividades2;

import java.util.Scanner;

public class MaioresQue8 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero, maior = 0;

		for (int i = 0; i < 20; i++) {
			System.out.print("Informe um número: ");
			numero = ler.nextInt();

			if (numero > 8) {
				maior++;
			}
		}
		System.out.println("Quantidade de números maiores que 8: " + maior);
		
		ler.close();
	}
}