package exemplos;

import java.util.Scanner;

public class AreaTriangulo {

	public static void main(String[] args) {
	    /*Descubra a �rea do que o usu�rio passar
	     * Trap�zio: A = ((B + b)/2) * h
	     * B = Base maior, b = base menor, h = altura
	     * 
	     * Tri�ngulo: A = (B*h)/2
	     * B = Base, h = altura
	     */


	    System.out.println("Bem-vindo ao calculador de �rea!");
	    System.out.println("Informe qual objeto quer calcular: ");

	    Scanner input = new Scanner(System.in);

	    boolean trap�zio = true, tri�ngulo = true;

	    if(trap�zio){
	        Double B,b,h,A;
	        
	        System.out.println("Informe o valor de B = base maior: ");
	        B = input.nextDouble();
	        System.out.println("Informe o valor de b = base menor: ");
	        b = input.nextDouble();
	        System.out.println("Informe o valor de h = altura");
	        h = input.nextDouble();
	        //calculando
	        A = ((B + b)/2)*h;
	        System.out.println("O valor dado � B: "+B+" b: "+b+" h: "+h);
	        System.out.println("A �rea do trap�zio �: "+A);
	        input.close();
	    }
	    if(tri�ngulo){
	        Double B,h,A;
	        
	        System.out.println("Informe o valor de B = base: ");
	        B = input.nextDouble();
	        System.out.println("Informe o valor de h = altura: ");
	        h = input.nextDouble();
	        //calculando
	        A = (B*h)/2;
	        System.out.println("O valor dado � B: "+B+" h: "+h);
	        System.out.println("A �rea do tri�ngulo �: "+A);
	        input.close();
	    }   


	}
}
