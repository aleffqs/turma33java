package aula4;

import java.util.Scanner;

public class ExercicioVetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				
		Scanner leia = new Scanner(System.in);
		
				double pontos[5], maior=0.0
				System.out.println();("-Verificando a maior nota-")
				para ( inteiro x=0; x<5; x++){
					escreva("\nDigite o valor da ",(x+1),"ª nota: ")
					leia (pontos[x])
				}
				escreva("\nPontuação é: ")
				para ( inteiro x=0; x<5; x++){
					escreva(" ",pontos[x],",")
				}
				para ( inteiro x=0; x<5; x++){
					se (maior<pontos[x]){
						maior=pontos[x]
					}			
				}
				escreva("\nA maior nota é :",maior)
			}

	}

}
