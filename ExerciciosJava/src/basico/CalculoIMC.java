package basico;

import java.util.Scanner;

public class CalculoIMC {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Insira seu peso: ");
		float peso = teclado.nextFloat();
		
		System.out.print("Insira sua altura: ");
		float altura = teclado.nextFloat();
		
		teclado.close();
		
		final float IMC = peso / (altura*altura);
		
		if (IMC < 18.5) {
			System.out.print("Abaixo do peso.");
		}
		else if (IMC >= 18.5 && IMC < 25) {
			System.out.print("Peso normal.");
		}
		else if (IMC >= 25 && IMC < 30) {
			System.out.print("Sobrepeso.");
		}
		else if (IMC >= 30 && IMC < 35) {
			System.out.print("Obesidade grau I.");
		}
		else if (IMC >= 35 && IMC < 40) {
			System.out.print("Obesidade grau II.");
		}
		else {
			System.out.print("Obesidade grau II.");
		}
	}

}
