package curso;

import java.util.Scanner;

public class cabecs {

	public static void main(String[] args) {
		
		System.out.println("\t\t\t TRANSFORMAÇÃO DE DE METROS POR SEGUNDO PARA KILOMETRO POR HORA\n");
	Scanner ler = new Scanner(System.in);
		
	System.out.println("Digite aqui a volocidade me Metros por segundo: ");
	String metros = ler.nextLine().replace(",", ".");
	double mts = Double.parseDouble(metros);
	
	double km = mts * 3.6;
	
	System.out.println("A velocidade em KM/H é de:" + km);
	ler.close();

	}

}
