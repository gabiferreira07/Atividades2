package Atividades2;

import java.util.Scanner;

public class Entre200While {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero, cont100 = 0, cont200 = 0, maior200 = 0, i = 0;

		while (i < 20) {
			System.out.print("Informe um número: ");
			numero = ler.nextInt();
			
			if (numero >= 0 && numero <= 100) {
				cont100++;
			} 
			else if (numero >= 101 && numero <= 200) {
				cont200++;
			} 
			else if (numero > 200) {
				maior200++;
			}

			i++;
		}
		System.out.println("Quantidade de números entre 0 e 100: " + cont100);
		System.out.println("Quantidade de números entre 101 e 200: " + cont200);
		System.out.println("Quantidade de números maiores que 200: " + maior200);
	}
}