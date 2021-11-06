package ExerciciosJava0510;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int numero;
		int soma = 0;
		do 
		{
		System.out.println("Para encerrar o programa digite 0, quando solicitado.");
		System.out.print("Informe um valor: ");
		numero = scan.nextInt();
		soma += numero;
		} 
		while (numero != 0);
		System.out.printf("A soma total dos valores inseridos é: %d.",soma);
	}

}
