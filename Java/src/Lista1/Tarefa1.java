package Lista1;

/*1. Fa�a um sistema que leia a idade de uma pessoa expressa em anos, meses e
dias e mostre-a expressa apenas em dias.*/

import java.util.Scanner;

public class Tarefa1 {

	public static void main(String[] args) {
		int idade, mes, dia, diasNasc;

		Scanner leia = new Scanner(System.in);

		System.out.print("Qual a sua idade: ");
		idade = leia.nextInt();
		System.out.print("Que mes voce nasceu: ");
		mes = leia.nextInt();
		System.out.print("Que dia voc� nasceu: ");
		dia = leia.nextInt();

		diasNasc = (idade * 365) + dia + (mes * 30);

		System.out.println("voce tem " + idade + " e sua idade aproximada expressa em dias � " + diasNasc);
	}

}