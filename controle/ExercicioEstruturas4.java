package controle;

import java.util.Scanner;

public class ExercicioEstruturas4 {

	public static void main(String[] args) {
		
		// recebe um numero e diga se ele e primo ou nao
		
		Scanner scanner = new Scanner(System.in);
		
		int contadorDeDivisores = 0;
		System.out.println("Informe o numero: ");
		int num = scanner.nextInt();
		
		for (int i = 2; i < num; i++) {
		if(num % i == 0) {
			contadorDeDivisores++;
		} 
	}
		if(contadorDeDivisores == 0) {
			System.out.println("O numero " + num + " e primo");
		} else {
			System.out.println("o numero " + num + " nao e primo");
		}
		scanner.close();
	}
}
