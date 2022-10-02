package programs;

public class DataTeste {
	
	public static void main(String[] args) {
		Data d1 = new Data();
		
		
		Data d2 = new Data(30,12,1970);
		
		String formatada = d1.dataformatada();
		String formatada2 = d2.dataformatada();
		System.out.println(formatada);
 		System.out.println(formatada2);
	
		
		
	}
}
