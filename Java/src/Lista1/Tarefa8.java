package Lista1;

/*O custo ao consumidor de um carro novo � a soma do custo de f�brica com a
percentagem do distribuidor e dos impostos (aplicados ao custo de f�brica).
Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
escrever um sistema que leia o custo de f�brica de um carro e escreva o custo ao
consumidor.*/

import java.util.Scanner;

public class Tarefa8 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		double custoDeFabrica, porcenDistribuidor, porcenImpostos, custoAoConsumidor;

		System.out.println("Qual o custo de fabrica? ");
		custoDeFabrica = leia.nextDouble();
		porcenDistribuidor = custoDeFabrica * 0.28;
		porcenImpostos = custoDeFabrica * 0.45;
		custoAoConsumidor = custoDeFabrica + porcenDistribuidor + porcenImpostos;
		System.out.println("O custo ao consumidor �: " + custoAoConsumidor);
	}

}