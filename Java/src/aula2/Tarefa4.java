package aula2;

import java.util.Scanner;

public class Tarefa4 {

public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		// Vari�veis
		int numero;

		// Entrada de dados
		System.out.print("Digite um numero inteiro:");
		numero = leia.nextInt();

		// Processamento e sa�da
		if ((numero % 2) == 0 && (numero > 1)) {
			System.out.print("Este n�mero � Par e � numero Positivo" + " e sua raiz quadrada �:"+Math.sqrt(numero));
		} else if (numero > 1) {
			System.out.print("Este n�mero � Impar e � numero positivo" + " e ele elevado ao quadrado �:"+Math.pow(numero, 2));
		} else if (numero == 0) {
			System.out.print("Este numero � neutro");
		} else {
			System.out.print("Este numero � negativo");
		}
		leia.close();
	}

}