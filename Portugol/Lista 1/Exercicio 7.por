programa
{

inclua biblioteca Matematica 

    funcao inicio()
    {
        inteiro a, b, c
         inteiro d, ee, f
         inteiro x, y

         //entrada
         escreva("a: ")
         leia(a)
         escreva("b: ")
         leia(b)
         escreva("c: ")
         leia(c)
         escreva("d: ")
         leia(d)
         escreva("e: ")
         leia(ee)
         escreva("f: ")
         leia(f)

         //processamento
         x = ((c*ee) - (b*f)) / ((a*ee) - (b*d))
         y = ((a*f) - (c*d) / (a*ee) - (b*d))

         c = ((a*x) + (b*y))
         f = ((d*x) + (ee*y))

         //saida
         escreva("\nO valor de x: "+x)
         escreva("\nO valor de y: "+y)
    }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 666; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */