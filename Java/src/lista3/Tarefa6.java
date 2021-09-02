package lista3;

/*6- Escrever um programa que receba vários números inteiros no teclado. E no
final imprimir a média dos números múltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)*/

import java.util.Scanner;

public class Tarefa6 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numero, soma = 0, contador = 0;
		double media=0.0;
		
		do {
			System.out.println("Digite um número");
			numero = leia.nextInt();
			System.out.println("----------------------");
			
			if(numero > 0 && numero % 3 == 0) {
				soma += numero;	
				contador++;
			}
			
		} while(numero > 0);
		
		media = soma / contador;		
		System.out.println("A média dos números digitados múltiplos de três é: " + media);
	}
}
