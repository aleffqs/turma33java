package exemplos;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int numero;
		
		System.out.print("Digite um numero inteiro: ");
		numero = leia.nextInt();
		
		if (numero == 0) {
			System.out.println("Zero � netro!!");
		}
		else (numero<0) {
			System.out.println("Numero negativo!!");
		}
		else (numero %2 ==0){
			
		}
		

	}

}

/*programa
{

funcao inicio()
{
	//vari�veis
	inteiro numero

	//entrada
	escreva("Digite um n�mero: ")
	leia(numero)
	
	//sa�da
	se(numero == 0){
		escreva(numero+" � neutro")
	} senao se(numero < 0){
		escreva("N�o � permitido n�mero negativo")
	} senao se(numero % 2 == 0){
		escreva(numero+" � par")
	} senao {
		escreva(numero+" � �mpar")
	}
}
}
*/