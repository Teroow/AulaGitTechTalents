package dia4;

import java.util.Scanner;
public class EsclarecendoDuvidaMaiorMenorMedia {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Informe o primeiro valor: ");
		int valor = in.nextInt();
		
		int menorValor = valor;
		int maiorValor = valor;
		
		System.out.println("Informe o segundo valor: ");
		valor = in.nextInt();         
		
		if(valor > maiorValor) {
			maiorValor = valor;
		}
		if(valor < menorValor) {
			menorValor = valor;
		}
		
		System.out.println("O maior valor é: " + maiorValor);
		System.out.println("O menor valor é: " + menorValor);
		
		in.close();
		
	}
	
	
	
}