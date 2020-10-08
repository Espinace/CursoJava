package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {

	public static void main(String[] args) {
		 String valor1 = JOptionPane.showInputDialog(
				 "Digite o primeiro numero:");
		 String valor2 = JOptionPane.showInputDialog(
				 "Digite o segundo numero:");
		 
		 System.out.println(valor1 + valor2);
		 
		 double num1 = Double.parseDouble(valor1);
		 double num2 = Double.parseDouble(valor2);
		 
		 double soma = num1 + num2;
		 System.out.println("Soma e " + soma);
		 System.out.println("Media e " + soma / 2);
		 
		 
	}
}
