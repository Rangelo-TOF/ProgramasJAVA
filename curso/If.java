package curso;

import javax.swing.JOptionPane;

public class If {
	
	public static void main(String[] args) {
		String valor = JOptionPane.showInputDialog(
				"informe o n?mero");
		
		int numero = Integer.parseInt(valor);
		
		if (numero % 2 == 0) {
			System.out.println("Numero par");
		}else {
			System.out.println("N?mero ?mpar");
		
		}
	}
			
}

