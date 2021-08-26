programa
{
	
	funcao inicio()
	{
		//variáveis
		 cadeia nome
		 caracter pronome
		 real nota=0.00, media=0.00, soma=0.00, maior=0.00
		 //entrada
		 escreva("Digite seu nome: ")
		 leia(nome)
		 escreva("Qual pronome prefere ser chamade? (a/e/o)")
		 leia(pronome)

		  para(inteiro x=1; x<=5; x++){
         		escreva("Digite uma nota: ")
         		leia(nota)
         
			soma = soma + nota
		}
		media = (soma / 5)
		se (media < 5.00){
			escreva("Olá "+nome+", sua média é: " + media+" vc será recuparad"+pronome+" em notas!!")	
		}
		senao se (media >= 5.00){
			escreva("Olá "+nome+", sua média é: " + media+" vc está aprovad"+pronome+"!!!")	
		}

		
		se (nota>maior){
			maior = nota
		}
		escreva("\nA maior nota foi: "+maior)
		
		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 712; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */