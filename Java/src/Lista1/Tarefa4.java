package Lista1;

/*4. Escreva um sistema que leia tr�s n�meros inteiros e positivos (A, B, C) e
calcule a seguinte express�o:*/

import java.util.Scanner;

public class Tarefa4 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		double R, S, D;
		int a, b, c;

		System.out.print("Qual o valor de a: ");
		a = leia.nextInt();
		System.out.print("Qual o valor de b: ");
		b = leia.nextInt();
		System.out.print("Qual o valor de c: ");
		c = leia.nextInt();

		R = (a + b) * (a + b);
		S = (b + c) * (a + b);
		D = (R + S) / 2;

		System.out.print("O valor da express�o � igual: " + D);

	}

}