package curso;

import java.util.Scanner;

public class temperatura {
	public static void main(String[] args) {
		
	Scanner ler = new Scanner(System.in);
	System.out.println("Digite um valor em celsius");
	double valor1 = ler.nextDouble();
	
	double result = valor1 *1.8 + 32;
	
	System.out.println("o valor em Fahrenheit é: " + result);
	
	
	
	ler.close();
	}

}
