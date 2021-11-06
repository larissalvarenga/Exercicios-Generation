package ExercíciosJava0410;

import java.util.Scanner;

public class Exercício4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero;
		double resultado;
		
		try (Scanner leia = new Scanner (System.in)) {
			System.out.println("\nEntre com um número :");
			numero = leia.nextInt();
		}
		
		if(numero % 2 == 0)
		{
			resultado = Math.sqrt(numero);
		}
		else
		{
			resultado = Math.pow(numero,2);
		}
		System.out.println("\nResultado : "+resultado);
	    }
    }
