package curso;

public class operadores2 {
	public static void main(String[] args) {

		double sub = 2 - 7;
		double sub1 = 1 - 5;
		double adi = 3 + 2;
		double mult = 6 * adi;
		double mult2 = 3 * 2;

		double resultado = sub * sub1 / 2;
		double elevacao = (double) Math.pow(resultado, 2);
		double ele = (double) Math.pow(mult, 2);
		double elevacao1 = ele / mult2;
		double dez = (double) Math.pow(10, 3);
		double semire = elevacao1 - elevacao;
		double contaFinal = (double) Math.pow(semire, 3);

		System.out.println(contaFinal / dez);
	}

}
