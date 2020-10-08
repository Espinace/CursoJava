package fundamentos;

import java.util.Scanner;

public class ExercicioQuadradoECubo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe o valor a ser calculado: ");
		double valor = scanner.nextDouble();
		
		double quad = valor * valor;
		double cubo = valor * valor * valor;
		
		System.out.print("Valor ao quadrado: " + quad +
				"\nValor ao cubo :" + cubo);
		
		
		scanner.close();
	}
}
