package fundamentos;

import java.util.Scanner;

public class ExercicioIMC {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Imforme seu peso: ");
		double peso = scanner.nextDouble();
		
		System.out.println("Informe sua altura: ");
		double altura = scanner.nextDouble();
		
		double calculo = peso / (altura * altura);
				
		System.out.print("Seu IMC total: " + calculo);
		
		
		scanner.close();
	}

}
