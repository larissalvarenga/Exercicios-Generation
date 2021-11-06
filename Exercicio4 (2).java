package ExerciciosJava0510;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		String sair = "";
		int cont = 0;
		int idade;
		int sexo;
		int temperamento; 
		int totalCalmos = 0;
		int mulheresNervosas = 0;
		int homensAgressivos = 0;
		int outrosCalmos = 0;
		int nervosasAcima40 = 0;
		int calmasMenor18 = 0;
		
		while(cont < 150) {
			System.out.println("Informe a idade do participante: ");
			idade = scan.nextInt();
			
			System.out.println("Escolha um número para o gênero: ");
			System.out.println("1- Feminino\n2- Masculino\n3- Outros");
			sexo = scan.nextInt();
			if(sexo != 1 || sexo != 2 || sexo != 3) 
			{
				sexo = 3;
			}

			System.out.println("Escolha um número correspondente a um temperamento: ");
			System.out.println("1- Calma\n2- Nervosa\n3- Agressiva");
			temperamento = scan.nextInt();
			
			if(temperamento == 1)
			{
				totalCalmos++;
			}
			if(sexo == 1 && temperamento == 2) 
			{
				mulheresNervosas++;
			} 
			else if (sexo == 2 && temperamento == 3) 
			{
				homensAgressivos++;
			} 
			else if (sexo == 3 && temperamento == 1) 
			{
				outrosCalmos++;
			}
			
			if (temperamento == 2 && idade >=40) 
			{
				nervosasAcima40++;
			}else if (temperamento == 1 && idade <=18) 
			{
				calmasMenor18++;
			}
			cont++;
		}
		System.out.printf("\nTotal de pessoas calmas: %d",totalCalmos);
		System.out.printf("\nTotal de mulheres nervosas: %d",mulheresNervosas);
		System.out.printf("\nTotal de homens agressivos: %d",homensAgressivos);
		System.out.printf("\nTotal de outros calmos: %d",outrosCalmos);
		System.out.printf("\nTotal de pessoas nervosas com mais de 40 anos: %d",nervosasAcima40);
		System.out.printf("\nTotal de menores de 18 anos calmos: %d",calmasMenor18);
	}
}
