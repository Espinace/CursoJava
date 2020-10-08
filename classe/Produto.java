package classe;

public class Produto {

	String nome;
	double preco;
	double desconto;

	Produto() {
		
	}
	
	Produto(String nomeInicial, double precoInical, double descontoInical) {
		nome = nomeInicial;
		preco = precoInical;
		desconto = descontoInical;
	}
	
	
	double precoComDesconto() {
		return preco * (1 - desconto);
		
	}
	
}
