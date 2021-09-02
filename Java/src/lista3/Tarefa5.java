package lista3;

/*5- Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.(DO...WHILE)*/

import java.util.Scanner;

public class Tarefa5 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numero, soma = 0;
		
		do {
			System.out.println("Digite um número");
			
			numero = leia.nextInt();
			
			System.out.println("----------------------");
			if(numero>0) {
				soma += numero;			
			}
			
		} while(numero > 0);
		
		System.out.println("A soma dos números digitados é: " + soma);
	}

}