package fundamentos;

import java.util.Scanner;

public class ExercicioTemperatura2 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe quantos graus Fahrenheit: ");
		double fahrenheit = scanner.nextDouble();
		
		double conversao = (fahrenheit - 32) / 1.8;
		
		System.out.print("Valor em Celsius: " + conversao);
		
		scanner.close();
	}

}
