package aula2;

import java.util.Scanner;

/*
  * Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
  * 
  */
public class Tarefa1 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int n1, n2, n3;

		System.out.print("Informe o primeiro numero: ");
		n1 = leia.nextInt();
		System.out.print("Informe o segundo numero: ");                                                                         
		n2 = leia.nextInt();
		System.out.print("Informe o terceiro numero: ");
		n3 = leia.nextInt();

		if (n1 > n2 && n1 > n3) {
			System.out.println("O maior numero � " + n1);
		} else if (n1 < n2 && n3 < n2) {
			System.out.println("O maior numero � " + n2);
		} else if((n1 < n3 && n3 > n2) ) { 
			System.out.println("O maior numero � " + n3);
		}
		leia.close();

	}

}