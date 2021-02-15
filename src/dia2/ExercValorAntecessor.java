package dia2;

/*Escreva um algoritmo para ler um valor (do teclado) e escrever 
(na tela) o seu antecessor.*/

//Meu algorítmo.
import java.util.Scanner;
public class ExercValorAntecessor {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int valor = scanner.nextInt();
		
		System.out.print("O antecessor de " + valor + " é " + (valor - 1));
		
		scanner.close(); //Usei o "scanner.close" para não ficar dando aquele erro "scanner is never closed".
	}
}

/*//Algorítmo do professor.
import java.util.Scanner;
public class ExercValorAntecessor {
	public static void main(String[] args) {
		System.out.println("Por favor digite um valor inteiro para que digamos qual é o seu antecessor");
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int antecessor = a - 1;
		System.out.println("O antecessor de " + a + " é: " + antecessor);
	}
}
*/
