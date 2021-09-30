programa
{
	
	funcao inicio()
	{
		inteiro pontos[5],x=0,maiorpont=0

		para(x=0;x<5;x++)
		{
			escreva("\nEscreva sua pontuaçao: ")
			leia(pontos[x])
			escreva("\nPosição: ",x+1,"\n")

			se(pontos[x]>maiorpont)
			{
				maiorpont=pontos[x]
			}
		}
		escreva("\nMaior pontuação: ",maiorpont, "\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 314; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */