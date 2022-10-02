package curso;

import java.util.Scanner;

public class Exercicio3DoCurso {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		System.out.println("digite a primeira nota: ");
		double nota = ler.nextDouble();
		System.out.println("digite uma segunda nota: ");
		double nota2 = ler.nextDouble();
		
		if (nota < 0 || nota > 10) {
			System.out.println("primeira nota invalida!!");
		}
		
		if ( nota2 <0 || nota2 >10) {
			System.out.println(" segunda nota invalida");
		}
		
		double soma = nota + nota2;
		double media = soma /2;
		if (media > 0 || media < 10) {
			
		}else if(media >= 7) {
			System.out.println("Aprovado");
		} else if (media >= 4) {
			System.out.println("Recuperação");
		}else {
			System.out.println("Reprovado");
		}
		ler.close();
	}

}
