package Lista1;

/*3. Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica
expressa em segundos e mostre-o expresso em horas, minutos e segundos.*/

import java.util.Scanner;

public class Tarefa3 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int seg, min, hor, segundos;

		System.out.print("Quanto tempo durou o evento em segundos: ");
		segundos = leia.nextInt();

		hor = segundos / 3600;
		min = (segundos % 3600) / 60;
		seg = (segundos % 3600) % 60;

		System.out
				.println("O tempo de durac�o do evento foi " + hor + " horas " + min + " minutos " + seg + " segundos");

	}

}