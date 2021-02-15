package dia3;

import java.util.Scanner;
public class SwitchCase {
	public static void main(String[] args) {
		
		/*//Exemplo 1
		int idade = 18;
		switch (idade) {
		case 18: 
			System.out.println("Você tem 18 anos de idade.");
		case 19:
			break;
			System.out.println("Você tem 19 anos de idade.");
			break;
		}
		*/			
		
		  //Exemplo 2
		Scanner in = new Scanner(System.in);
		System.out.println("Digite 1 para turno da manhã. | Digite 2 para turno da tarde. | Digite 3 para turno da noite. ");
		int selecionadorDeTurno = in.nextInt();
		final int turnoManha = 1;
		final int turnoTarde = 2;
		final int turnoNoite = 3;
		
		switch(selecionadorDeTurno) {
			case(turnoManha):
				System.out.println("Esse turno possui tarefas relacionadas à limpeza.");
				break;
			case(turnoTarde):
				System.out.println("Esse turno possui tarefas relacionadas à iluminação do local.");
				break;
			case(turnoNoite):
				System.out.println("Esse turno possui tarefas relacionadas à desmontagem dos equipamentos de som.");
				break;				
		}
		
		in.close();
		
	}
}

