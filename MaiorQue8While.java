package Atividades2;

import java.util.Scanner;

public class MaiorQue8While {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero, maior = 0,  i = 0;
		
		while (i < 20) {
			i++;
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








