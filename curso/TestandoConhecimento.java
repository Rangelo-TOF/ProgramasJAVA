package curso;

import java.util.Scanner;

public class TestandoConhecimento {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		System.out.println("Digite um numero para saber se ele é impar o par:");
		double valor = ler.nextDouble();
		
		if( valor % 2 == 0) {
			System.out.println("o Numero é par!!");
			
		}else {
			System.out.println("O numero é impar");
		}
		
		System.out.println("Obrigado por usar o meu programa!");
		
		ler.close();

	}

}
