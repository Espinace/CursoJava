package controle;

import java.util.Scanner;

public class ExercicioEstruturas5 {

	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);
		
		int contadorDeDivisores = 0;
		System.out.println("Informe o numero: ");
		int num = scanner.nextInt();
		
		for (int i = 2; i < num; i++) {
			if(num % i == 0) {
				contadorDeDivisores++;
			} 
		}
		
		switch(contadorDeDivisores) {
		case 0:
			System.out.println("O numero " + num + " e primo");
			break;
		default:
			System.out.println("O numero " + num + " nao e primo");
		}
		
		scanner.close();
	}
}
