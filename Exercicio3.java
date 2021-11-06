package ExercíciosJava0410;

import java.util.Scanner;

public class Exercício3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int idade;
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Informe a idade: ");
		idade=scan.nextInt();
		
		if(idade<10) 
		{
			System.out.println("Essa opção não se encaixa em nossas categorias. ");
		}
		if(idade>=10 && idade<=14) {
			System.out.println("Categoria infantil. ");
		}
		if(idade>=15 && idade<=17) {
			System.out.println("Categoria juvenil. ");
		}
		if(idade>=18 && idade<=25) {
			System.out.println("Categoria adulto. ");
		}
		if(idade>25) {
			System.out.println("Essa opção não se encaixa em nossas categorias. ");
		}
	}

}
