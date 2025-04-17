package basico;

import java.util.Scanner;

// Peça para que o usuário insira seu nome e três notas, em seguida, calcule a média e imprima no console.

public class CalculoMediaNotas {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("--- Programa de cálculo de média de notas ---\n");
		
		System.out.print("Insira seu nome: ");
		String nome = teclado.nextLine();
		
		System.out.print("Insira sua primeira nota: ");
		float nota1 = teclado.nextFloat();
		
		System.out.print("Insira sua segunda nota: ");
		float nota2 = teclado.nextFloat();
		
		System.out.print("Insira sua terceira nota: ");
		float nota3 = teclado.nextFloat();
		
		teclado.close();
		
		float media = (nota1 + nota2 + nota3) / 3;
		
		System.out.printf("\n%s, a média das suas notas foi de %.2f", nome, media);
	}

}
