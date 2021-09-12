package funcionario;

import java.util.Locale;
import java.util.Scanner;

public class CadFunc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Funcionario func1 = new Funcionario("01","Marcos",40,10.00)
		Terceiro func2 = new Terceiro("03", "Carla",48,10.00,8.25)
		
		System.out.println(func1.toString());
		
		//Variaveis
		Locale.setDefault(US);
		Scanner leia = new Scanner(System.in);
		
		char tipo; 
		
		System.out.println("Cadastro e Calculo Salarial");
		System.out.println("Digite \n1 - Funcionario\n2 - Terceiro: ");
		tipo = leia.next().charAt(0);
		System.out.println("Digite a matricula: ");
		String matricula = leia.next();
		leia.nextLine();
		System.out.println("Digite o nome: ");
		String nome = leia.nextLine().toUpperCase();
		System.out.println("Digite as horas trabalhadas: ");
		int horasTrabalhas = leia.nextInt();
		System.out.println("Digite o valor por hora: R$");
		double valorHora = leia.nextDouble();
		
		if
	}

}
