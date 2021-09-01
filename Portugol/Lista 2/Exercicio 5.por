/*5) A Secretaria de Meio Ambiente que controla o índice de poluição mantém 3 grupos de
indústrias que são altamente poluentes do meio ambiente. O índice de poluição aceitável
varia de 0,05 até 0,25. Se o índice sobe para 0,3 as indústrias do 1º grupo são intimadas a
suspenderem suas atividades, se o índice crescer para 0,4 as industrias do 1º e 2º grupo são
intimadas a suspenderem suas atividades, se o índice atingir 0,5 todos os grupos devem ser
notificados a paralisarem suas atividades. Faça um sistema que leia o índice de poluição
medido e emita a notificação adequada aos diferentes grupos de empresas.*/

programa
{
	
	funcao inicio()
	{
	// variáveis	
		real ipa =0.00
		inteiro ng

			
	// entrada
		escreva ("Por favor, informe o seu índice de poluição:")
		leia (ipa)
	// processamento
		escreva ("\nA notificação do Poluômetro é a seguinte: \n")		
		se (ipa >= 0.3 e ipa < 0.4)
		{
			escreva ("As indústrias do 1º grupo devem suspender suas atividades, imediatamente!")
		}
		senao se (ipa >= 0.4 e ipa < 0.5)
		{
			escreva ("As indústrias dos grupo 1 e 2 devem suspender suas atividades, imediatamente!")
		}
		senao se (ipa >= 0.5)
		{
			escreva ("As indústrias de todos os grupos devem encerrar as suas atividades, IMEDIATAMENTE!")
		}
		senao
		{
			se (ipa >= 0.25 e ipa < 0.5)		
				escreva ("Está tudo bem!")
			senao			
				escreva ("Valor inválido!")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1391; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */