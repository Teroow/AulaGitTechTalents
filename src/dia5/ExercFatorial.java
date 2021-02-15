package dia5;

import java.util.Scanner;
public class ExercFatorial {
	public static void main(String[] args) {
		/*
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		int valor = in.nextInt();
		
		int resultado = valor;
		
		int calculo = valor * resultado;
		
		while (resultado > 1) {
		valor = valor - 1;
		resultado = resultado - 1;
		
		System.out.println(resultado);	
		
		}
		*/
		Scanner in = new Scanner(System.in);
		System.out.println("Digite um valor: ");
		int valor = in.nextInt();
		int resultado = 1;
		
		while (valor > 1) {
			resultado = resultado * valor;
			valor--;
		}
		
		System.out.println(resultado);
		
		in.close();
		
	}
}