package Lista1;

/*Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste
aluno. Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5,
respectivamente.*/

import java.util.Scanner;

public class Tarefa5 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		double aluno1, aluno2, aluno3, media;

		System.out.println("Aluno 1: ");
		aluno1 = leia.nextDouble();
		System.out.println("Aluno 2: ");
		aluno2 = leia.nextDouble();
		System.out.println("Aluno 3: ");
		aluno3 = leia.nextDouble();
		media = ((aluno1 * 2) + (aluno2 * 3) + (aluno3 * 5)) / 10;
		System.out.println("A m�dia ponderada �: " + media);

	}

}