package controle;

import java.util.Scanner;

public class ExercicioEstrutura2 {

	public static void main(String[] args) {
		
		//Criar um programa que informa se o ano atual e um ano bissexto
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe o ano: ");
		int ano = scanner.nextInt();
		
			if (ano % 4 == 0) { //anos multiplos de 4
				System.out.println("Esse ano e bissexto");
			} 
			else {
				System.out.println("Esse ano nao e bissexto");
			}
		scanner.close();
		
		
	}
}
