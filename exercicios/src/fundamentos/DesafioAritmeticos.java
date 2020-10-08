package fundamentos;

public class DesafioAritmeticos {

	public static void main(String[] args) {
		
		int a = 6 * (3 + 2);
		int b = (int) Math.pow(a, 2);
		int c = b / (3 * 2);
		
		int d = (1 - 5) * (2 -7) / 2;
		int e = (int) Math.pow(d, 2);
		
		int f = (c - e);
		int g = (int) Math.pow(f, 3);
		
		int h = 10;
		int i = (int) Math.pow(h, 3);
		
		int j = g / i;
		
		System.out.println("O resultado e: " + j);
		
		
		
	}
}
