package controle;

import java.util.Scanner;

public class ExercicioEstruturas3 {

	public static void main(String[] args) {
		
		/* receba duas notas parciais
		 * calcular media final
		 * se for <= 7.0 && > 4.0 imprime "Recuperacao"
		 * se for o contrario "Reprovado"  
		 */
		
		Scanner scanner = new Scanner(System.in);		
		
		System.out.println("Digite a nota 1: ");
		double nota1 = scanner.nextDouble();
		System.out.println("Digite a nota 2: ");
		double nota2 = scanner.nextDouble();
		
		double media = nota1 + nota2;
		double mediaFinal = media /2;
		
		if(mediaFinal >= 7.0) {
			System.out.println("Aprovado");
		} else if(mediaFinal >= 4.0) {
			System.out.println("Recuperacao");
		} else {
			System.out.println("Reprovado");
		}
		
		scanner.close();
	}
}
