package curso;

import java.util.Scanner;

public class TestandoConhecimento {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		System.out.println("Digite um numero para saber se ele � impar o par:");
		double valor = ler.nextDouble();
		
		if( valor % 2 == 0) {
			System.out.println("o Numero � par!!");
			
		}else {
			System.out.println("O numero � impar");
		}
		
		System.out.println("Obrigado por usar o meu programa!");
		
		ler.close();

	}

}
