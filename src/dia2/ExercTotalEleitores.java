package dia2;

/*
Escreva um algoritmo para ler o n�mero total de eleitores de um munic�pio,
o n�mero de votos brancos, nulos e v�lidos. Calcular e escrever o percentual 
que cada um representa em rela��o ao total de eleitores.
*/
//Formula de exemplo (regra de tr�s): brancos * 100 / eleitores


//Algor�tmo do professor.
/*import java.util.Scanner;
public class ExercTotalEleitores {
	
	public static double calculaPercentualX(double totalX, double totalEleitores){ //Isso � uma fun��o (que retorna um double).
		
		double percentual = totalX * 100 / totalEleitores;
		return percentual;
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("A quantidade total de votos �: ");
		double totalVotos = scanner.nextDouble();
		
		System.out.println("A quantidade total de votos em branco �: ");
		double totalVotosBrancos = scanner.nextDouble();
		
		System.out.println("A quantidade total de votos nulos �: ");
		double totalVotosNulos = scanner.nextDouble();
		
		System.out.println("A quantidade total de votos v�lidos �: ");
		double totalVotosValidos = scanner.nextDouble();
		
		double percentualVotosBrancos = ExercTotalEleitores.calculaPercentualX(totalVotosBrancos, totalVotos);
		
		double percentualVotosNulos = ExercTotalEleitores.calculaPercentualX(totalVotosNulos, totalVotos); 
				
		double percentualVotosValidos = ExercTotalEleitores.calculaPercentualX(totalVotosValidos, totalVotos);		
		
		System.out.println("-----------");
		
		System.out.println("O percentual total de votos em branco �: " + percentualVotosBrancos);
		
		System.out.println("O percentual total de votos nulos �: " + percentualVotosNulos);
		
		System.out.println("O percentual total de votos v�lidos �: " + percentualVotosValidos);
		
		scanner.close();
		
	}
}
*/


//Meu algor�tmo.
import java.util.Scanner;
public class ExercTotalEleitores {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("1�. Informe o n�mero total de votos: ");
		int totalDeVotos = scanner.nextInt();
		
		System.out.print("2�. Quantidade de votos em branco: ");
		int votosEmBranco = scanner.nextInt();
		
		System.out.print("3�. Quantidade de votos nulos: ");
		int votosNulos = scanner.nextInt();
		
		System.out.print("4�. Quantidadede de votos v�lidos: ");
		int votosValidos = scanner.nextInt();
		
		System.out.println("Os votos em branco equivalem a " + (votosEmBranco * 100 / totalDeVotos) + "% do total de votos.");
		
		System.out.println("Os votos nulos equivalem a " + (votosNulos * 100 / totalDeVotos) + "% do total de votos.");
		
		System.out.println("Os votos v�lidos equivalem a " + (votosValidos * 100 / totalDeVotos) + "% do total de votos.");
								
		scanner.close();
	}
}