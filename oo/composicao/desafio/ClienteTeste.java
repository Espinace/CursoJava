package oo.composicao.desafio;

public class ClienteTeste {

	public static void main(String[] args) {
		
		
		Compra compra1 = new Compra();
		compra1.adicionarItem("Caneta", 9.67, 100);
		compra1.adicionarItem(new Produto("Notwbook", 1897.88), 2);
		
		Compra compra2 = new Compra();
		compra2.adicionarItem("Caderno", 9.99, 10);
		compra2.adicionarItem(new Produto("Impressora", 578.27), 1);
		
		Cliente cliente = new Cliente("Bruno Amazonas Espinace");
		cliente.compras.add(compra1);
		cliente.compras.add(compra2);
		
		System.out.println(cliente.obterValorTotal());
		
	}
}

