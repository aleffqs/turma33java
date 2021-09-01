programa
{
	/*2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
expressa em anos, meses e dias.*/
	funcao inicio()
	{
	inteiro dias, mes, anos, idade
	
		escreva("Informe a sua idade em dias: ")
		leia (idade)

		anos = idade/365
		mes = (idade%365)/30
		dias = (idade%365)%30

		escreva ("\nAnos: " +anos)
		escreva ("\nMeses: " +mes)
		escreva ("\nDias: " +dias)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 128; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */