programa
{
	
	funcao inicio()
	{
		inteiro matriz
		[3][3],somatotal=0,somadiagonal=0
		escreva ("\nMatriz três por três ")

		para(inteiro coluna=0;coluna<3;coluna++)
		{
			para(inteiro linha=0;linha<3;linha++)
			{
				escreva("\nEscreva um valor: ")
				leia(matriz[linha][coluna])
		     
		     somatotal+=matriz[linha][coluna]

		     se(linha==coluna)
		     {
		     	somadiagonal+=matriz[linha][coluna]
		               }
			     }
		     }
		     escreva("\nSoma total: ",somatotal)
		     escreva("\nsoma diagonal: ",somadiagonal)
	          }
	}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 206; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {matriz, 6, 10, 6};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */