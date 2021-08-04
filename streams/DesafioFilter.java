package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {

	public static void main(String[] args) {
		
		DesafioProduto c1 = new DesafioProduto("teclado" , 129.99, false);
		DesafioProduto c2 = new DesafioProduto("mouse" , 49.99, true);
		DesafioProduto c3 = new DesafioProduto("mousepad" , 19.99, true);
		DesafioProduto c4 = new DesafioProduto("fita LED" , 69.99, true);
		DesafioProduto c5 = new DesafioProduto("Controle" , 62.99, true);
		DesafioProduto c6 = new DesafioProduto("Pilhas" , 11.99, true);
		
		List<DesafioProduto> clientes = Arrays.asList(c1, c2, c3, c4, c5, c6);
		
		Predicate<DesafioProduto> parcela = c -> c.preco >= 60.00;
		Predicate<DesafioProduto> desconto = c -> c.pagamentoAVista;
		Function<DesafioProduto, String> liberadoDesconto = 
				c -> "Cliente que comprar " + c.preco + " e pagar a vista tem desconto!";
				
		clientes.stream()
		.filter(parcela)
		.filter(desconto)
		.map(liberadoDesconto)
		.forEach(System.out::println);
		
	}
}
