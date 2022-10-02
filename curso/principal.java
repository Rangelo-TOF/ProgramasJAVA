package curso;


import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		String nome;
		String sobrenome;
		int idade;
		Scanner ler = new Scanner(System.in);
		System.out.println("No campo abaixo escreva o seu nome e a sua idade: ");
		
		System.out.print("qual o seu nome?");
		nome = ler.nextLine();
		System.out.print("qual o seu sobrenome? ");
		sobrenome = ler.nextLine();
		System.out.print(" qual a sua idade ?");
		idade = ler.nextInt();
		
		
		
		
		
		System.out.printf("o seu nome é %s %s e sua idade é %d", nome, sobrenome, idade);
		
		ler.close();

	}

}


