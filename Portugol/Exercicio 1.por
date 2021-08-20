programa
{
	/* 1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
dias e mostre-a expressa apenas em dias.*/
	funcao inicio()
	{
	inteiro ano, mes, dia, idade
	
		escreva ("Quantos anos vc tem? ")
		leia (ano)
		escreva ("Quantos meses? ")
		leia (mes)
		escreva ("Quantos dias? ")
		leia (dia)

		idade = (ano*365) + (mes*30) + dia

		escreva ("Sua idade aproximada em dias é: " +idade+ " dias")  
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 18; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */