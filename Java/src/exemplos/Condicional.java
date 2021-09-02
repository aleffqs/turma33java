package exemplos;

import java.util.Scanner;

public class Condicional {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String nome; 
		int anoNascimento, idade;
		
		System.out.print("Digite o seu nome");
		nome = leia.next();
		System.out.print("Digite o ano de nascimento");
		anoNascimento = leia.nextInt();
		
		idade = 2021 - anoNascimento;
		
		if (idade>45) {
		System.out.printf("%s sua idade é %d anos, vc é cringe e seu salario é R$ %.2f",nome,idade,salario);
		}
		else if (idade>=18) {
			System.out.printf("%s sua idade é %d anos, vc é cringe e seu salario é R$ %.2f",nome,idade,salario);
		}
		
		}
	}

}
