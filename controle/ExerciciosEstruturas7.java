package controle;

import java.util.Scanner;

public class ExerciciosEstruturas7 {

	public static void main(String[] args) {
		
		/*
		 * Criar um programa que enquanto estiver recebendo números positivos,
		 *  imprime no console a soma dos números inseridos,
		 *   caso receba um número negativo, encerre o programa.
		 *    Tente utilizar a estrutura do while.
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		int num = 0;
		int soma = 0;
		
		while (num >= 0) {
			System.out.println("Informe o numero (somente numeros positivos!): ");
			num = scanner.nextInt();
			
			if(num >= 0) {
				soma += num;
				System.out.printf("\nSoma até o momento: %d\n", soma);
			}
		}
	
		scanner.close();
	}
}
