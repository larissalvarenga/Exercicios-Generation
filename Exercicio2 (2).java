package ExerciciosJava0510;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int num;
		int par = 0;
		int impar = 0;
		for(int i = 0; i < 10; i++) 
		{
		System.out.println("Informe um n�mero: ");
		num = scan.nextInt();
		if (num % 2 == 0) 
		{
		par++;
		}
		else
		{
		impar++;
		}
		}
		System.out.printf("voc� informou %d n�meros pares" + ",%n e %d n�meros impares",par,impar);
	}

}

