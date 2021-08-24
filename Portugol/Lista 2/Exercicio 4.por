/*4) Faça um sistema que leia um número inteiro e mostre uma mensagem indicando se este
número é par ou ímpar, e se é positivo ou negativo.*/
programa
{
	
	funcao inicio()
	{
		//variáveis
		inteiro numero

		//entrada
		escreva("Digite um número: ")
		leia(numero)
		
		//saída
		se(numero == 0){
			escreva(numero+" é neutro")
		} 
		senao se(numero < 0 e numero % 2 == 0){
			escreva(numero+" é par e negativo")
		} 
		senao se(numero % 2 == 0){
			escreva(numero+" é par e positivo")
		} 
		senao se(numero % 2 == 1){
			escreva(numero+" é impar e positivo")
		} 
		senao {
			escreva(numero+" é ímpar e negativo")
		}
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 141; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */