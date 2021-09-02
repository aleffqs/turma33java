package exemplos;

import java.util.Scanner;

public class Lacos {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		double somatorio=0.0, media, total=0.0, n=0.0;

				while (n>=0){
					
					System.out.println("Digite o numero a ser somado:");
					n = leia.nextDouble()
					if (n<0){
						Break;
					}
					somatorio = (somatorio+n);
					total=(total+1);
					
				}
				System.out.println("A somatória dos numeros digitados é de: ",somatorio);
				media=somatorio/total;
				System.out.println("\nA média dos valores digitados é de: ", media);
				System.out.println(""\nO total de numeros digitados é de: ", total);
			}
		}

	}

}
