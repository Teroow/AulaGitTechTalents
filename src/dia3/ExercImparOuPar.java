package dia3;

//Meu algorítmo.
import java.util.Scanner;
public class ExercImparOuPar {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		
		int numero = in.nextInt();
		
		int resultado = numero % 2;
		
		if(resultado == 1) {
			System.out.println("Esse número é impar.");
		} else { 
			System.out.println("Este número é par.");
		}
		
		in.close();
		
	}
}


/*//Algorítmo do professor.
java.util.Scanner;
public class ExercImparOuPar {
	public static void main(String[] args) {
				
		System.out.println("Por favor digite um número");
		
		Scanner in = new Scanner(System.in);
		int numero = in.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println("É um número par");
		} else {
			System.out.println("É um número impar");
		}
		in.close();
	}
}
*/

/*//Algorítmo do professor com boolean
import java.util.Scanner;
public class ExercImparOuPar {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int numero = in.nextInt();
		boolean par = numero % 2 == 0;
		
		if (par) {
			System.out.println("É um número par");
		} else if (!par) {
			System.out.println("É um número impar");
		}
		in.close();
	}
}
*/
