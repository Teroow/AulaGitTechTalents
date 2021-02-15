package dia4;

/*
Escreva um algoritmo em Java que seja capaz de fazer as seguintes opera��es matem�ticas 
(adi��o, subtra��o, multiplica��o e divis�o). Todas as opera��es ser�o entre dois valores. 
No come�o do algoritmo pergunte ao usu�rio qual opera��o ele deseja fazer e quais s�o os valores.
import java.util.Scanner;
*/


/*//Algor�tmo do professor.
import java.util.Scanner;
public class OperacoesMatematicas {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite a opera��o que deseja fazer (a, s, m, d)");
		String operacao = in.next();
		
		System.out.println("Digite o primeiro valor: ");
		int valor1 = in.nextInt();
		
		System.out.println("Digite o segundo valor: ");
		int valor2 = in.nextInt();
		
		System.out.println("Opera��o: " + operacao);
		
		System.out.println("Valor1: " + valor1);
		
		System.out.println("Valor2: " + valor2);
		
		switch(operacao) {
			case "a":
				int soma = valor1 + valor2;
				System.out.println("A soma entre os valores �: " + soma);
				break;
			case "s":
				int subtracao = valor1 - valor2;
				System.out.println("A subtra��o entre os valores �: " + subtracao);
				break;
			case "m":
				int multiplicacao = valor1 * valor2;
				System.out.println("A multiplica��o entre os valores �: " + multiplicacao);
				break;
			case "d":
				int divisao = valor1 / valor2;
				System.out.println("A divis�o entre os valores �: " + divisao);
			default:
				System.out.println("Opera��o n�o encontrada.");
		}
		
	}
}
*/

//Meu algor�tmo, com "if/else" e, "case" do "switch" com vari�veis dentro.
import java.util.Scanner;
public class OperacoesMatematicas {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int continuarPrograma = 1;
		while (continuarPrograma == 1) {
		System.out.print("Qual opera��o matem�tica voc� deseja fazer? (1)Adi��o (2)Subtra��o (3)Multiplica��o (4)Divis�o: ");
		
		int operacao = in.nextInt();
	
		System.out.print("Digite o primeiro valor: ");
		int valor1 = in.nextInt();
		
		System.out.print("Digite o segundo valor: ");
		int valor2 = in.nextInt();
		
		switch(operacao) {
			case 1:
				int adicao = valor1 + valor2;
				System.out.println("O resultado da adi��o entre " + valor1 + " e " + valor2 + " � igual a " + adicao + ".");
				break;
			case 2: 
				int subtracao = valor1 - valor2;
				System.out.println("O resultado da subtra��o de " + valor1 + " por " + valor2 + " � igual a " + subtracao + ".");
				break;
			case 3: 
				int multiplicacao = valor1 * valor2;
				System.out.println("O resultado da multiplica��o de " + valor1 + " por " + valor2 + " � igual a " + multiplicacao + ".");
				break;
			case 4:
				if(valor2 == 0) {
					System.out.println("N�o se pode dividir por 0.");
				} else {
					double divisao = valor1 / (double) valor2;
					System.out.println("O resultado da divis�o de " + valor1 + " por " + valor2 + " � igual a " + divisao + ".");
				}
				break;
			default: 
				System.out.println("Opera��o n�o encontrada.");
			}
			
			System.out.print("Deseja continuar o programa? (1)Sim / (0)N�o ");
			continuarPrograma = in.nextInt();
		}
		
		in.close();
		
	}
}


/*//Meu algor�tmo (sem vari�veis nos cases do switch).
import java.util.Scanner;
public class OperacoesMatematicas {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int continuarPrograma = 1;
		while (continuarPrograma == 1){
		System.out.print("Qual opera��o matem�tica voc� deseja fazer? (1)Adi��o (2)Subtra��o (3)Multiplica��o (4)Divis�o: ");
		
		int operacao = in.nextInt();
	
		System.out.print("Digite o primeiro valor: ");
		int valor1 = in.nextInt();
		
		System.out.print("Digite o segundo valor: ");
		int valor2 = in.nextInt();
		
		switch(operacao) {
			case 1:
				System.out.println("O resultado da soma � " + (valor1 + valor2));
				break;
			case 2: 
				System.out.println("O " + valor1 - valor2);
				break;
			case 3: 
				System.out.println("O resultado da multiplica��o de " + valor1 + " por " + valor2 + " � igual a " + valor1 * valor2 + ".");
				break;
			case 4:
				System.out.println("O resultado da divis�o de " + valor1 + " por " + valor2 + " � igual a " + valor1 / valor2 + ".");
				break;
			default: 
				System.out.println("Opera��o n�o encontrada.");
			}
			
			System.out.print("Deseja continuar o programa? (1)Sim / (0)N�o: ");
			continuarPrograma = in.nextInt();
		}
	}
}
*/