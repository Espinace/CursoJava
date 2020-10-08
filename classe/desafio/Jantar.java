package classe.desafio;

public class Jantar {

	public static void main(String[] args) {
		
		//criar 2 comidas/pratos
		//peso antes e depois de comer da pessoa
		
		Comida c1 = new Comida("Arroz", 0.180);
		Comida c2 = new Comida("Feijao",0.300);
		
		Pessoa p1 = new Pessoa("Joao", 99.8);
		
		System.out.println(p1.apresentar());
		p1.comer(c1);
		System.out.println(p1.apresentar());
		p1.comer(c2);
		System.out.println(p1.apresentar());
	}
}
