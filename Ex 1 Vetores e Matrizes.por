programa
{
	
	funcao inicio()
	{
		inteiro nota[5],somamedia=0,maior=0,x,contmaior=0
		real medialanc

		para(x=0;x<5;x++)
		{
			escreva("\nEntre com a nota: ")
			leia(nota[x])
			enquanto(nota[x]<1 ou nota[x]>10)
			

			somamedia += nota[x]

			se(maior<nota[x])
			{
				maior = nota[x]
				
			}
		}
		escreva("\nA maior nota que apareceu foi: ",maior)
		
		para(x=0;x<5;x++)
		{
			se(nota[x] == maior)
			{
				contmaior++
			}
		}

		
		

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 225; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */