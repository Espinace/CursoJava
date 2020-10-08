package controle;

import java.util.Scanner;

public class ExercicioEstruturas9 {

	public static void main(String[] args) {
		
		//Crie um programa que recebe 10 valores e ao final imprima o maior número.

		Scanner scanner = new Scanner(System.in);
		
		int contador = 0;
		int maiorValor = 0;
		
		do {
			System.out.println("Digite o numero: ");
			int valor = scanner.nextInt();
			
			if(valor > maiorValor) {
				maiorValor = valor;}
		
		contador++;
	} while(contador != 10);
	
	     System.out.printf("O maior valor foi: " + maiorValor);
	
		scanner.close();
	}
}
