package dia3;

import java.util.Scanner;
public class IfElseDirigir {
	public static void main(String[] args) {
		System.out.println("Esse � um programa para saber se voc� pode ou n�o dirigir!");
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Por favor, informe a sua idade: ");
		int idade = in.nextInt();
		
		if (idade >= 18) {
			System.out.println("Parab�ns, voc� j� pode dirigir!");
		} else {
			System.out.println("Infelizmente voc� ainda n�o pode dirigir.");
			
			in.close();
			
		}
	}
}