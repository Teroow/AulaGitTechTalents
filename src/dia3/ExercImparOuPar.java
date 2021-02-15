package dia3;

//Meu algor�tmo.
import java.util.Scanner;
public class ExercImparOuPar {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		
		int numero = in.nextInt();
		
		int resultado = numero % 2;
		
		if(resultado == 1) {
			System.out.println("Esse n�mero � impar.");
		} else { 
			System.out.println("Este n�mero � par.");
		}
		
		in.close();
		
	}
}


/*//Algor�tmo do professor.
java.util.Scanner;
public class ExercImparOuPar {
	public static void main(String[] args) {
				
		System.out.println("Por favor digite um n�mero");
		
		Scanner in = new Scanner(System.in);
		int numero = in.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println("� um n�mero par");
		} else {
			System.out.println("� um n�mero impar");
		}
		in.close();
	}
}
*/

/*//Algor�tmo do professor com boolean
import java.util.Scanner;
public class ExercImparOuPar {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Digite um n�mero: ");
		int numero = in.nextInt();
		boolean par = numero % 2 == 0;
		
		if (par) {
			System.out.println("� um n�mero par");
		} else if (!par) {
			System.out.println("� um n�mero impar");
		}
		in.close();
	}
}
*/
