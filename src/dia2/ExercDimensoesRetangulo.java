package dia2;

/*//Algor�tmo do professor.
import java.util.Scanner;
public class ExercDimensoesRetangulo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Esse algor�tmo calcula a �rea de um ret�ngulo");
		
		System.out.println("Por favor digite a base do ret�ngulo");
		double base = scanner.nextDouble();
		
		System.out.println("Por favor digite a altura do ret�ngulo");
		double altura = scanner.nextDouble();
		
		double area = base * altura;
		
		System.out.println("A �rea do ret�ngulo �: " + area);
		
		
	}
}
*/  
  
/*//Meu segundo algor�tmo, com 3 vari�veis.
import java.util.Scanner;
public class ExercDimensoesRetangulo {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a base do ret�ngulo: ");
		double base = scanner.nextDouble();
		
		System.out.println("Digite a altura do ret�ngulo: ");
		double altura = scanner.nextDouble();
		
		double resultado = base * altura;
		System.out.println("A �rea do ret�ngulo �: " + resultado);
	}
}
*/

//Meu primeiro algor�tmo, com 2 var�aveis.
import java.util.Scanner;
public class ExercDimensoesRetangulo {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a base do ret�ngulo: ");
		double base = scanner.nextDouble();
		
		System.out.println("Digite a altura do ret�ngulo: ");
		double altura = scanner.nextFloat();
		
		System.out.println("A �rea do ret�mgulo � de " + (base * altura));
		
		scanner.close();
	}
}