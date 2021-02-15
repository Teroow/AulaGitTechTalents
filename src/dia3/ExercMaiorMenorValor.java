package dia3;

/*
Escreva um algoritmo em Java que leia dois números inteiros e determine qual 
é o menor. Escreva um algoritmo que determina o maior também.
 */
import java.util.Scanner;

public class ExercMaiorMenorValor {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Digite o primeiro número: ");
		int primeiroNumero = in.nextInt();
		
		System.out.println("Digite o segundo número: ");
		int segundoNumero = in.nextInt();
		
		if(primeiroNumero < segundoNumero) {
			System.out.println("O número " + primeiroNumero + " é menor " + segundoNumero);
		} else if(primeiroNumero > segundoNumero) {
			System.out.println("O número " + segundoNumero + " é maior que " + primeiroNumero);
		}
		in.close();
	}
}