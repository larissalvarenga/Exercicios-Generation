package ExerciciosJava0510;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("\t\tSe deseja parar o programa informe o valor -99 quando for solicitado.");
		System.out.println("Informe uma idade: ");
		int idade = scan.nextInt();
		int menor = 0;
		int maior = 0;
		
		while(idade != -99) 
		{
		if(idade >=0 && idade < 21) 
		{
		menor++;
		}
		else if(idade > 50 && idade <= 127)
		{
		maior++;
		}
		System.out.println("Informe uma idade: ");
		idade = scan.nextInt();
		}
		System.out.printf("%nVocê informou um total de %d idades menores de 21." + "%nE %d idades ascima de 50 anos.", menor,maior);
		
	}

}
