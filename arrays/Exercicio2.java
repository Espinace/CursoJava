package arrays;

public class Exercicio2 {

public static void main(String[] args) {
		
		double[] notasAlunoA = { 7.9, 8, 6.7, 9.7 };

		for(double notaA: notasAlunoA) {
			System.out.print(notaA + " ");
		}
		
		System.out.println();
		
		double [] notasAlunoB = { 6.9, 8.9, 5.5, 10 };
		
		for (int i = 0; i < notasAlunoB.length; i++) {
			System.out.print(notasAlunoB[i] + " ");
		}
	}

}
