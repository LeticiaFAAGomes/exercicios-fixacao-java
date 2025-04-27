package basico;

import java.util.Scanner;

// Desenvolva um programa que, com base em duas entradas inteiras e uma operação, execute o cálculo correspondente e exiba o resultado no console.

public class calculadora {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Insira a operação desejada: ");
		char operacao = in.next().charAt(0);
		
		System.out.print("Insira o primeiro número: ");
		int num1 = in.nextInt();
		
		System.out.print("Insira o segundo número: ");
		int num2 = in.nextInt();
		
		in.close();
		
		float resultado = 0;
		
		if (operacao == '+') {
			resultado = num1 + num2;
		}
		else if (operacao == '-') {
			resultado = num1 - num2;
		}
		else if (operacao == '*') {
			resultado = num1 * num2;
		}
		else if (operacao == '/') {
			resultado = num1 / num2;
		}
		else {
			System.out.print("Operação inválida. Por favor, insira apenas as operações: '+', '-', '*' ou '/'");
		}
		
		if (resultado > 0) {
			System.out.printf("%d %s %d = %f", num1, operacao, num2, resultado);
		}
		
		
	}

}
