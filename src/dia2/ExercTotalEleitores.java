package dia2;

/*
Escreva um algoritmo para ler o número total de eleitores de um município,
o número de votos brancos, nulos e válidos. Calcular e escrever o percentual 
que cada um representa em relação ao total de eleitores.
*/
//Formula de exemplo (regra de três): brancos * 100 / eleitores


//Algorítmo do professor.
/*import java.util.Scanner;
public class ExercTotalEleitores {
	
	public static double calculaPercentualX(double totalX, double totalEleitores){ //Isso é uma função (que retorna um double).
		
		double percentual = totalX * 100 / totalEleitores;
		return percentual;
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("A quantidade total de votos é: ");
		double totalVotos = scanner.nextDouble();
		
		System.out.println("A quantidade total de votos em branco é: ");
		double totalVotosBrancos = scanner.nextDouble();
		
		System.out.println("A quantidade total de votos nulos é: ");
		double totalVotosNulos = scanner.nextDouble();
		
		System.out.println("A quantidade total de votos válidos é: ");
		double totalVotosValidos = scanner.nextDouble();
		
		double percentualVotosBrancos = ExercTotalEleitores.calculaPercentualX(totalVotosBrancos, totalVotos);
		
		double percentualVotosNulos = ExercTotalEleitores.calculaPercentualX(totalVotosNulos, totalVotos); 
				
		double percentualVotosValidos = ExercTotalEleitores.calculaPercentualX(totalVotosValidos, totalVotos);		
		
		System.out.println("-----------");
		
		System.out.println("O percentual total de votos em branco é: " + percentualVotosBrancos);
		
		System.out.println("O percentual total de votos nulos é: " + percentualVotosNulos);
		
		System.out.println("O percentual total de votos válidos é: " + percentualVotosValidos);
		
		scanner.close();
		
	}
}
*/


//Meu algorítmo.
import java.util.Scanner;
public class ExercTotalEleitores {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("1°. Informe o número total de votos: ");
		int totalDeVotos = scanner.nextInt();
		
		System.out.print("2°. Quantidade de votos em branco: ");
		int votosEmBranco = scanner.nextInt();
		
		System.out.print("3°. Quantidade de votos nulos: ");
		int votosNulos = scanner.nextInt();
		
		System.out.print("4°. Quantidadede de votos válidos: ");
		int votosValidos = scanner.nextInt();
		
		System.out.println("Os votos em branco equivalem a " + (votosEmBranco * 100 / totalDeVotos) + "% do total de votos.");
		
		System.out.println("Os votos nulos equivalem a " + (votosNulos * 100 / totalDeVotos) + "% do total de votos.");
		
		System.out.println("Os votos válidos equivalem a " + (votosValidos * 100 / totalDeVotos) + "% do total de votos.");
								
		scanner.close();
	}
}