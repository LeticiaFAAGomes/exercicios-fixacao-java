package basico;

import java.util.Scanner;

public class ParOuImpar {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Insira um número inteiro: ");
		int n = teclado.nextInt();
		
		teclado.close();
		
		if (n % 2 == 0) {
			System.out.printf("O número %d é par.", n);;
		} else {
			System.out.printf("O número %d é ímpar.", n);
		}
	}

}
