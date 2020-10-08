package fundamentos;

import java.util.Scanner;

public class ExercicioBhaskara {
	public static void main(String[] args) {
		
		//(ax2 + bx + c = 0)
		//exemplo a = 1, b = 12 e c = -13
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Equação: ax² + bx + c = 0");
		
		System.out.println("Informe o valor de a: ");
		int a = scanner.nextInt();
		
		System.out.println("\nInforme o valor de b: ");
		int b = scanner.nextInt();
		
		System.out.println("\nInforme o valor de c: ");
		int c = scanner.nextInt();
		
		int delta = (b * b) - (4 * a * c);
		
		System.out.printf("\nSua equação é: %dx² + %dx + %d = 0", a, b, c);
		
		System.out.println("\nO Delta é: " + delta);
		
		double x1 = (-b + Math.sqrt(delta)) / (2 * a);
		
		System.out.printf(" O x1 da esquacao e: %.2f", x1);
		
		double x2 = (-b - Math.sqrt(delta)) / (2 * a);
		
		System.out.printf("\nO x2 da equacao e: %.2f", x2);
		scanner.close();
	}

}
