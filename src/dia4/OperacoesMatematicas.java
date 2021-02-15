package dia4;

/*
Escreva um algoritmo em Java que seja capaz de fazer as seguintes operações matemáticas 
(adição, subtração, multiplicação e divisão). Todas as operações serão entre dois valores. 
No começo do algoritmo pergunte ao usuário qual operação ele deseja fazer e quais são os valores.
import java.util.Scanner;
*/


/*//Algorítmo do professor.
import java.util.Scanner;
public class OperacoesMatematicas {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite a operação que deseja fazer (a, s, m, d)");
		String operacao = in.next();
		
		System.out.println("Digite o primeiro valor: ");
		int valor1 = in.nextInt();
		
		System.out.println("Digite o segundo valor: ");
		int valor2 = in.nextInt();
		
		System.out.println("Operação: " + operacao);
		
		System.out.println("Valor1: " + valor1);
		
		System.out.println("Valor2: " + valor2);
		
		switch(operacao) {
			case "a":
				int soma = valor1 + valor2;
				System.out.println("A soma entre os valores é: " + soma);
				break;
			case "s":
				int subtracao = valor1 - valor2;
				System.out.println("A subtração entre os valores é: " + subtracao);
				break;
			case "m":
				int multiplicacao = valor1 * valor2;
				System.out.println("A multiplicação entre os valores é: " + multiplicacao);
				break;
			case "d":
				int divisao = valor1 / valor2;
				System.out.println("A divisão entre os valores é: " + divisao);
			default:
				System.out.println("Operação não encontrada.");
		}
		
	}
}
*/

//Meu algorítmo, com "if/else" e, "case" do "switch" com variáveis dentro.
import java.util.Scanner;
public class OperacoesMatematicas {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int continuarPrograma = 1;
		while (continuarPrograma == 1) {
		System.out.print("Qual operação matemática você deseja fazer? (1)Adição (2)Subtração (3)Multiplicação (4)Divisão: ");
		
		int operacao = in.nextInt();
	
		System.out.print("Digite o primeiro valor: ");
		int valor1 = in.nextInt();
		
		System.out.print("Digite o segundo valor: ");
		int valor2 = in.nextInt();
		
		switch(operacao) {
			case 1:
				int adicao = valor1 + valor2;
				System.out.println("O resultado da adição entre " + valor1 + " e " + valor2 + " é igual a " + adicao + ".");
				break;
			case 2: 
				int subtracao = valor1 - valor2;
				System.out.println("O resultado da subtração de " + valor1 + " por " + valor2 + " é igual a " + subtracao + ".");
				break;
			case 3: 
				int multiplicacao = valor1 * valor2;
				System.out.println("O resultado da multiplicação de " + valor1 + " por " + valor2 + " é igual a " + multiplicacao + ".");
				break;
			case 4:
				if(valor2 == 0) {
					System.out.println("Não se pode dividir por 0.");
				} else {
					double divisao = valor1 / (double) valor2;
					System.out.println("O resultado da divisão de " + valor1 + " por " + valor2 + " é igual a " + divisao + ".");
				}
				break;
			default: 
				System.out.println("Operação não encontrada.");
			}
			
			System.out.print("Deseja continuar o programa? (1)Sim / (0)Não ");
			continuarPrograma = in.nextInt();
		}
		
		in.close();
		
	}
}


/*//Meu algorítmo (sem variáveis nos cases do switch).
import java.util.Scanner;
public class OperacoesMatematicas {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int continuarPrograma = 1;
		while (continuarPrograma == 1){
		System.out.print("Qual operação matemática você deseja fazer? (1)Adição (2)Subtração (3)Multiplicação (4)Divisão: ");
		
		int operacao = in.nextInt();
	
		System.out.print("Digite o primeiro valor: ");
		int valor1 = in.nextInt();
		
		System.out.print("Digite o segundo valor: ");
		int valor2 = in.nextInt();
		
		switch(operacao) {
			case 1:
				System.out.println("O resultado da soma é " + (valor1 + valor2));
				break;
			case 2: 
				System.out.println("O " + valor1 - valor2);
				break;
			case 3: 
				System.out.println("O resultado da multiplicação de " + valor1 + " por " + valor2 + " é igual a " + valor1 * valor2 + ".");
				break;
			case 4:
				System.out.println("O resultado da divisão de " + valor1 + " por " + valor2 + " é igual a " + valor1 / valor2 + ".");
				break;
			default: 
				System.out.println("Operação não encontrada.");
			}
			
			System.out.print("Deseja continuar o programa? (1)Sim / (0)Não: ");
			continuarPrograma = in.nextInt();
		}
	}
}
*/