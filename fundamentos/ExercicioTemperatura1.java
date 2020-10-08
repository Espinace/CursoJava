package fundamentos;

import java.util.Scanner;

public class ExercicioTemperatura1 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe quantos graus Celsius: ");
		double celsius = entrada.nextDouble();
		
		double conversao = (1.8 * celsius) + 32;
		
		System.out.print("Valor em Fahrenheit: " + conversao);
		
		entrada.close();
		
		
		
	}

}
