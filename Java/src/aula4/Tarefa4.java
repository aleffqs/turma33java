/*Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e em seguida, 
exiba a soma dos valores dela e a soma dos valores da primeira diagonal, ou seja, diagonal principal.*/

package aula4;

import java.util.Scanner;

public class MatrizDiagonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
			
		int m1[][] = new int[3][3], total = 0, diagonal = 0;
				
				for (int x=0; x<3;x++){
					for(int y=0; y<3; y++){
						System.out.print("\nDigite o valor da matriz M1 na linha "+x+" e na coluna "+y+"  ");
						m1[x][y] = leia.nextInt();
						total = total+m1[x][y];
						if(x==y){
							diagonal=diagonal+m1[x][y];
						}
					}
				}
				System.out.print("A somatória total é: "+ total);
				System.out.print("\nA somatória da diagonal principal é de: "+ diagonal);
	}

}
