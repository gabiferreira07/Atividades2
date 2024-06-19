package Atividades2;

import java.util.Scanner;

public class ParesWhile {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n, par = 0, i = 1;

		while(i < 20) {
			i++;
			System.out.print("Informe um número: ");
			n = ler.nextInt();
			
			if (n % 2 == 0) {
				par++;
			}
		System.out.println("Quantidade de número par: " + par);
		
		ler.close();
		}
	}
}
