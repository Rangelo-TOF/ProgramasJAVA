package curso;

import java.util.Scanner;

public class mert {

	public static void main(String[] args) {
		
		
		Scanner ler = new Scanner(System.in);
		
		
		System.out.println("digite aqui o seu salario de Janeiro: ");
		String sl1 = ler.nextLine().replace(",", ".");
		System.out.println("digite aqui o seu salario de Fevereiro: ");
		String sl2 = ler.nextLine().replace(",", ".");
		System.out.println("digite aqui o seu salario de Março: ");
		String sl3 = ler.nextLine().replace(",", ".");

		
		double sal1 = Double.parseDouble(sl1);
		double sal2 = Double.parseDouble(sl2);
		double sal3 = Double.parseDouble(sl3);
		double soma = sal1 + sal2+ sal3;
		System.out.println(" a media salarial é : " + soma / 3);
		
		ler.close();
	}

}
