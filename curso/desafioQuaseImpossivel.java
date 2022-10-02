package curso;

import java.util.Scanner;

public class desafioQuaseImpossivel {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
	
		System.out.println("Digite um valor entre 0 e 10: ");
		int valor = ler.nextInt();
		
		if (valor > 10 || valor < 0){
			System.out.println("valor invalido!!");
		} else if (valor % 2 ==1) {
			System.out.println("Nùmero impar");
		} else {
			System.out.println("Nùmero par");
		}
		
		
		
		
		ler.close();
	}

}
