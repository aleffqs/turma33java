package exemplos;

import java.util.Locale;

public class FacaEnquanto {
	

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		int cont = 233; 
		do {
			if(cont >=400 && cont <= 500) {
				cont = cont + 5;
			}
			else {
				cont = cont +3;
			}
			System.out.println("\n"+ cont);
			
		}while(cont < 456);
	}
}
