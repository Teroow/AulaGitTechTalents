package dia3;

/*
Escreva um algoritmo em Java que leia dois n�meros inteiros e determine qual 
� o menor. Escreva um algoritmo que determina o maior tamb�m.
 */
import java.util.Scanner;

public class ExercMaiorMenorValor {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Digite o primeiro n�mero: ");
		int primeiroNumero = in.nextInt();
		
		System.out.println("Digite o segundo n�mero: ");
		int segundoNumero = in.nextInt();
		
		if(primeiroNumero < segundoNumero) {
			System.out.println("O n�mero " + primeiroNumero + " � menor " + segundoNumero);
		} else if(primeiroNumero > segundoNumero) {
			System.out.println("O n�mero " + segundoNumero + " � maior que " + primeiroNumero);
		}
		in.close();
	}
}