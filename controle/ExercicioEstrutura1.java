package controle;

import java.util.Scanner;

public class ExercicioEstrutura1 {

	public static void main(String[] args) {
		
		// Criar um programa que receba um numero 
		// e verifique se ele esta entre 0 e 10 e ser par.

		Scanner scanner = new Scanner(System.in);
		
		String grupo = "";
		System.out.println("Informe o numero: ");
	    int numero = scanner.nextInt();
	    
	    switch(numero) {
	    case 1: case 3: case 5: case 7: case 9:
	    	grupo = "Impar";
	    	break;
	    case 2: case 4: case 6: case 8: case 10:
	    	grupo = "Par";
	    	break;
	    default:
	    	grupo = "Nao incluso ";
	    }
		System.out.println("Esse numero pertence ao grupo " + grupo);
		scanner.close();
	}			
}
