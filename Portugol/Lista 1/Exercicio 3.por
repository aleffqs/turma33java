programa
{
	/*3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica
expressa em segundos e mostre-o expresso em horas, minutos e segundos.*/
	funcao inicio()
	{
	inteiro tempo, horas, minutos, segundos
	
		escreva("Informe o tempo de duração de um evento em uma fábrica em segundos: ")
		leia (tempo)

		horas = tempo/3600
		minutos = (tempo%3600)/60
		segundos = (tempo%3600)%60

		escreva ("\nHoras: " +horas)
		escreva ("\nMinutos: " +minutos)
		escreva ("\nSegundos: " +segundos)
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 321; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */