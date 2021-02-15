package dia2;

/*//Algorítmo do professor.
import java.util.Scanner;
public class ExercDimensoesRetangulo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Esse algorítmo calcula a área de um retângulo");
		
		System.out.println("Por favor digite a base do retângulo");
		double base = scanner.nextDouble();
		
		System.out.println("Por favor digite a altura do retângulo");
		double altura = scanner.nextDouble();
		
		double area = base * altura;
		
		System.out.println("A área do retângulo é: " + area);
		
		
	}
}
*/  
  
/*//Meu segundo algorítmo, com 3 variáveis.
import java.util.Scanner;
public class ExercDimensoesRetangulo {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a base do retângulo: ");
		double base = scanner.nextDouble();
		
		System.out.println("Digite a altura do retângulo: ");
		double altura = scanner.nextDouble();
		
		double resultado = base * altura;
		System.out.println("A área do retângulo é: " + resultado);
	}
}
*/

//Meu primeiro algorítmo, com 2 varíaveis.
import java.util.Scanner;
public class ExercDimensoesRetangulo {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a base do retângulo: ");
		double base = scanner.nextDouble();
		
		System.out.println("Digite a altura do retângulo: ");
		double altura = scanner.nextFloat();
		
		System.out.println("A área do retâmgulo é de " + (base * altura));
		
		scanner.close();
	}
}