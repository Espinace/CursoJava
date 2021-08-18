package lambdas;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.List;

public class Consumidor {

	public static void main(String[] args) {
		
		Consumer<Produto> imprimirNome = p -> System.out.println(p.nome);
		
		Produto p1 = new Produto("Caneta", 12.34, 0.09);
		imprimirNome.accept(p1);
		
		Produto p2 = new Produto("Notebook", 3047.99, 0.25);
		Produto p3 = new Produto("Caderno", 19.99, 0.03);
		Produto p4 = new Produto("Borracha", 7.08, 0.18);
		Produto p5 = new Produto("Lapis", 4.50, 0.20);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);
		
		produtos.forEach(imprimirNome);
		produtos.forEach(p -> System.out.println(p.preco));
		produtos.forEach(System.out::println);
	}
}
