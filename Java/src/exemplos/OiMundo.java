package turma33java;

import java.util.Scanner;

public class OiMundo {
	
	public static void main(String[] args) {

		//variaveis
		Scanner leia = new Scanner(System.in);
		String nome;
		int anoNascimento;
		int anoAtual=2021;
		
		//entradas
		System.out.println("Digite o nome: ");
		nome = leia.next();
		System.out.println("Digite o ano de nascimento:");
		anoNascimento = leia.nextInt();
		
		//saida
		System.out.println(nome.toUpperCase()+" sua idade é "+(anoAtual-anoNascimento)+" anos.");
	}

}
