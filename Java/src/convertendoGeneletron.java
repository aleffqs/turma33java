
public class convertendoGeneletron {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 9) Perguntar se ele continua ou não
		System.out.println("Gostaria de continuar comprando (s ou n) ");
		System.out.println(continuarComprandoV);

		                    if(continuarComprandoV == 'n' ou continuarComprandoV == 'N')
		                    {
		                        if ((continuarComprandoV == 'n' ou continuarComprandoV == 'N') e finalizarPrograma == true)
		                        {
		                            System.out.println("ATÉ BREVE!!");
		                            continuarCompra = false;
		                            break
		                        }
		                        // 10) mostrar carinho de compra, total e imposto, e escolher a forma de pagamento 
		                            int formaDePagamento;
		                            double    totalDaCompra;
		                            double   impostoDaCompra;    
		                            double       totalAPagar;
		                            double   parcelasIguais;
		                            Boolean escolhendoFormaDePagamento;

		                            totalDaCompra = 0.0;
		                            impostoDaCompra = 0.0;
		                            totalAPagar = 0.0;
		                            escolhendoFormaDePagamento = true;
		                            parcelasIguais = 0.0;

		                            limpa();
		                            // 10.a) calcular total da compra
		                            for(int linha = 0; linha < 10; linha++)
		                            {
		                                if(carrinho[linha] != 0)
		                                {
		                                    double valorDoProduto = Tipos.cadeia_para_real(Texto.substituir(Texto.substituir(Texto.substituir(produtos[linha][2],".",""),",00",""),",","."));
		                                    totalDaCompra += valorDoProduto * carrinho[linha];                                 
		                                    // calcula a quantidade de cada produto vezes o preço
		                                }
		                            }
		                            // 10.b) calcular importo
		                            impostoDaCompra = totalDaCompra * 0.09;

		                            do {
		                                limpa();
		                                System.out.println("GENELETRON\n");
		                                System.out.println("-----------------------------------------------\n");
		                                System.out.println("Gerando economia e qualidade pro seu dia a dia!\n\n");

		                                // 10.c) mostrar os dois
		                                System.out.println("Total da compra: R$ " + totalDaCompra +"\n");
		                                System.out.println("Valor do Imposto sobre a Compra (9%): R$ " + mat.arredondar(impostoDaCompra, 2) + "\n\n");

		                                // 10.d) exibir as formas e mostrar forma de pagamento
		                                System.out.println("Escolha a forma de pagamento: \n");
		                                System.out.println("OPÇÕES DE PAGAMENTO:\n");
		                                System.out.println("1) Á Vista Com 10% Desconto.\n");
		                                System.out.println("2) No cartão com 10% de acrescimo.\n");
		                                System.out.println("3) Em duas vezes com 15% de taxa.\n");
		                                System.out.println(formaDePagamento);

		                                // 10.e) de acordo com a forma de pagamento, calcular o totalAPagar
		                                totalAPagar = totalDaCompra + impostoDaCompra;

		                                if (formaDePagamento == 1)
		                                {
		                                    totalAPagar -= totalAPagar * 0.10; // calculo do desconto
		                                    escolhendoFormaDePagamento = false;
		                                }
		                                else if(formaDePagamento == 2)
		                                {
		                                    totalAPagar += totalAPagar * 0.10 // calcule o acréscimo
		                                    escolhendoFormaDePagamento = false
		                                }
		                                else(formaDePagamento == 3)
		                                {
		                                    totalAPagar += totalAPagar * 0.15; // parcelas
		                                    parcelasIguais = (totalAPagar / 2);
		                                    escolhendoFormaDePagamento = false;
		                                }
		                                else
		                                {
		                                    System.out.println ("Essa não é uma forma de pagamento válida!");
		                                    escolhendoFormaDePagamento = true;
		                                }
		                            }while(escolhendoFormaDePagamento == true)


}
