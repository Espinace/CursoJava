package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<String>();
		
		// Offer e Add -> adicionam elementos na fila
		// Diferenca e o comportamento ocorre quando a fila esta cheia!
		fila.add("Ana"); // Retorna falso
		fila.offer("Bia"); // Lanca uma excessao
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		//Peek e Element -> Obter o proximo elemento da fila (sem remover)
		// Diferenca e o comportamento ocorre quando a fila esta vazia!
		System.out.println(fila.peek()); // Retorna falso
		System.out.println(fila.element()); // Lanca uma excessao
		
		
		//Poll e Remove -> Obter o proximo elemento da fila e remove!
		// Diferenca e o comportamento ocorre quando a fila esta vazia!
		System.out.println(fila.poll()); // retorna null
		System.out.println(fila.remove()); // lanca uma excessao
	}
}
