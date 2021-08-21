programa
{
	/* 4. Escreva um sistema que leia três números inteiros e positivos (A, B, C) e
calcule a seguinte expressão: */

	inclua biblioteca Matematica
 --> Mat
	
	funcao inicio()
	{

	real a, b, c, d, r, s
	
		escreva("Digite o valor de A: ")
		leia (a)
		escreva("Digite o valor de B: ")
		leia (b)
		escreva("Digite o valor de C: ")
		leia (c)

		r = Mat.potencia((a+b), 2)
		escreva("\nO valor de R é: " + r)

		s = Mat.potencia((b+c), 2)
		escreva("\nO valor de S é: " + s)

		d = (r+s)/2
		escreva("\nO valor de D é: " + d)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 497; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */