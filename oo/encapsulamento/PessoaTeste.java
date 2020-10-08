package oo.encapsulamento;

public class PessoaTeste {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Bruno", 22);
		p1.setIdade(-230); //alterar
		
		System.out.println(p1.getIdade()); //ler
		System.out.println(p1); //toString
	}
}
