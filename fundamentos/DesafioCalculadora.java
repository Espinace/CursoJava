package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		
		// Ler num1
		// Ler num2
		// x = + - * / %
		// num1 x num2
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o numero: ");
		double num1 = entrada.nextDouble();
		
		System.out.print("Informe a operacao: ");
		String op = entrada.next();
		
		System.out.print("Informe o numero: ");
		double num2 = entrada.nextDouble();
		
		
		// Logica
		double resultado = "+".equals(op) ? num1 + num2 : 0;
		resultado = "-".equals(op) ? num1 - num2 : resultado;
		resultado = "*".equals(op) ? num1 * num2 : resultado;
		resultado = "/".equals(op) ? num1 / num2 : resultado;
		resultado = "%".equals(op) ? num1 % num2 : resultado;
				
		System.out.printf("%f %s %f = %f", num1, op, num2, resultado);
		
		entrada.close();
	}
}
