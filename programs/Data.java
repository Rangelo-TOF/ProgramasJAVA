package programs;

public class Data {

	int dia;
	int mes;
	int ano;
	
	String dataformatada () {
		return String.format("%d/ %d/ %d", dia, mes,ano);
	}
	
	Data (){
		 dia = 1;
		mes = 1;
		ano = 1970;
		
	}
	
	Data(int diaIni, int mesIni, int anoIni) {
		 dia = diaIni;
		 mes = mesIni;
		 ano = anoIni;
	}
	
}
 