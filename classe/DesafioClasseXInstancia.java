package classe;

public class DesafioClasseXInstancia {

	String nome;
	double valor;
	static double desconto = 0.25;
	
    DesafioClasseXInstancia() {
		
	}
	
	DesafioClasseXInstancia(String nomeInicial, double valorInical) {
		nome = nomeInicial;
		valor = valorInical;
	}
	
	
	double valorComDesconto() {
		return valor * (1 - desconto);
		
	}
	
}
