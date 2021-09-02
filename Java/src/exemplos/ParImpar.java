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
			System.out.println("Zero é netro!!");
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
	//variáveis
	inteiro numero

	//entrada
	escreva("Digite um número: ")
	leia(numero)
	
	//saída
	se(numero == 0){
		escreva(numero+" é neutro")
	} senao se(numero < 0){
		escreva("Não é permitido número negativo")
	} senao se(numero % 2 == 0){
		escreva(numero+" é par")
	} senao {
		escreva(numero+" é ímpar")
	}
}
}
*/