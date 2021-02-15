package dia3;

import java.util.Scanner;
public class ExercEnsinoMedioIdade {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int continuarCodigo = 1;
		
		while(continuarCodigo == 1) {
			
			boolean ensinoMedio = true;
			
			System.out.println("Digite a sua idade: ");
			int idade = in.nextInt();
			
			if (idade >= 16 && ensinoMedio) {
				System.out.println("Parabéns! Agora você pode ingressar na faculdade.");
			} else {
				System.out.println("Infelizmente você não está apto a ingressar na faculdade.");
			}
			
			System.out.println("Deseja continuar executando o programa? Sim(1)/Não(0)");
			continuarCodigo = in.nextInt();
			
		}
		
		in.close();
		
	}
}