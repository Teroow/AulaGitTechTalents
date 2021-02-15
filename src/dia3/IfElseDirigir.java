package dia3;

import java.util.Scanner;
public class IfElseDirigir {
	public static void main(String[] args) {
		System.out.println("Esse é um programa para saber se você pode ou não dirigir!");
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Por favor, informe a sua idade: ");
		int idade = in.nextInt();
		
		if (idade >= 18) {
			System.out.println("Parabéns, você já pode dirigir!");
		} else {
			System.out.println("Infelizmente você ainda não pode dirigir.");
			
			in.close();
			
		}
	}
}