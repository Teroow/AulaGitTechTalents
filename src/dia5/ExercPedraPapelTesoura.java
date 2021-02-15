package dia5;

//Meu algorítmo do pedra, papel e tesoura emplementado com while e contador.
import java.util.Scanner;
public class ExercPedraPapelTesoura {
	public static void main(String[] args) {
		
		int pedra = 1;
		int papel = 2;
		int tesoura = 3;
		int contador = 1;
		Scanner in  = new Scanner(System.in);
		System.out.println("Esse é um jogo de pedra, papel e tesoura.");
		
		while (contador < 4) {
		
			System.out.println("---------------------------------------------------------------");
			
			System.out.println("Escolha do primeiro jogador: Pedra (1) / Papel (2) / Tesoura (3)");
			int primeiroJogador = in.nextInt();
			
			if (primeiroJogador != pedra && primeiroJogador != papel && primeiroJogador != tesoura) {
				System.out.println("Essa não é uma opção válida, execute o programa novamente.");
				System.exit(0);
			}
			
			System.out.println("Escolha do segundo jogador: Pedra (1) / Papel (2) / Tesoura (3)");
			int segundoJogador = in.nextInt();
			
			if (segundoJogador != pedra && segundoJogador != papel && segundoJogador != tesoura) {
				System.out.println("Essa não é uma opção válida, execute o programa novamente.");
				System.exit(0);
			}
			
			if (primeiroJogador == segundoJogador) {
				System.out.println("Houve um empate.");
				System.exit(0);
			}
			
			switch(primeiroJogador) {
				case 1: //Vai parar no case 1, quando o jogador n°1 colocar 1 na variável primeiroJogador.
					if (segundoJogador == papel) {
						System.out.println("Rodada " + contador + "/3. " + "Vitória do 2° jogador, papel vence pedra!");					
					}
					if (segundoJogador == tesoura) {
						System.out.println("Rodada " + contador + "/3. " + "Vitória do 1° jogador, pedra vende tesoura!");
					}
					break;
				case 2: 
					if (segundoJogador == pedra) {
						System.out.println("Rodada " + contador + "/3. " + "Vitória do 1° jogador, papel vence pedra!");
					}
					if (segundoJogador == tesoura) {
						System.out.println("Rodada " + contador + "/3. " + "Vitória do 2° jogador, tesoura vence papel!");
					}
					break;
				case 3: 
					if (segundoJogador == papel) {
						System.out.println("Rodada " + contador + "/3. " + "Vitória do 1° jogador, tesoura vence papel!");
					}
					if (segundoJogador == pedra) {
						System.out.println("Rodada " + contador + "/3. " + "Vitória do 2° jogador, pedra vence tesoura!");
					}
					break;
			}
			
			contador++;
			
			if (contador == 4) {
				in.close();
			}
			
		}
	}
}

//----------------------------------------------------------------------------------------------------------------------------------------

/*//Meu algorítmo (sem emplementos).
import java.util.Scanner;
public class ExercPedraPapelTesoura {
	public static void main(String[] args) {
		
		int pedra = 1;
		int papel = 2;
		int tesoura = 3;

		Scanner in  = new Scanner(System.in);
		System.out.println("Esse é um jogo de pedra, papel e tesoura.");
		
		
			System.out.println("Escolha do primeiro jogador: Pedra (1) / Papel (2) / Tesoura (3)");
			int primeiroJogador = in.nextInt();
			
			if (primeiroJogador != pedra && primeiroJogador != papel && primeiroJogador != tesoura) {
				System.out.println("Essa não é uma opção válida, execute o programa novamente.");
				System.exit(0);
			}
			
			System.out.println("Escolha do segundo jogador: Pedra (1) / Papel (2) / Tesoura (3)");
			int segundoJogador = in.nextInt();
			
			if (segundoJogador != pedra && segundoJogador != papel && segundoJogador != tesoura) {
				System.out.println("Essa não é uma opção válida, execute o programa novamente.");
				System.exit(0);
			}
			
			if (primeiroJogador == segundoJogador) {
				System.out.println("Houve um empate.");
			}
			
			switch(primeiroJogador) {
				case 1: //Vai parar no case 1, quando o jogador n°1 colocar 1 na variável primeiroJogador.
					if (segundoJogador == papel) {
						System.out.println("Vitória do 2° jogador, papel vence pedra!");					
					}
					if (segundoJogador == tesoura) {
						System.out.println("Vitória do 1° jogador, pedra vende tesoura!");
					}
					break;
				case 2: 
					if (segundoJogador == pedra) {
						System.out.println("Vitória do 1° jogador, papel vence pedra!");
					}
					if (segundoJogador == tesoura) {
						System.out.println("Vitória do 2° jogador, tesoura vence papel!");
					}
					break;
				case 3: 
					if (segundoJogador == papel) {
						System.out.println("Vitória do 1° jogador, tesoura vence papel!");
					}
					if (segundoJogador == pedra) {
						System.out.println("Vitória do 2° jogador, pedra vence tesoura!");
					}
					break;
			}
		}
}
*/

//----------------------------------------------------------------------------------------------------------------------------------------

/*//Algorítmo do professor.
import java.util.Scanner;
public class ExercPedraPapelTesoura {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		final String pedra = "pe";
		final String papel = "pa";
		final String tesoura = "t";
		
		System.out.println("Vamos jogar Pedra (1), Papel (2), Tesoura (3)!");
		
		System.out.println("Insira a escolha do jogador 1.");
		int escolhaJogador1 = in.nextInt();
		if (!(escolhaJogador1.equals(pedra) || escolhaJogador1.equals(papel) || escolhaJogador1.equals(tesoura))) {
			System.out.println("O jogador 1 não escolheu uma opção válida.");
			System.exit(0);
		}
		
		System.out.println("Insira a escolha do jogador 2");
		int escolhaJogador2 = in.nextInt();
		if (!(escolhaJogador2.equals(pedra) || escolhaJogador2.equals(papel) || escolhaJogador2.equals(tesoura))) {
			System.out.println("O jogador 1 não escolheu uma opção válida.");
			System.exit(0);
		} 
		
		if (escolhaJogador1 == escolhaJogador2) {
			System.out.println("Houve empate.");
		}
		
		switch(escolhaJogador1) {
			case 1: //Pedra vs tesoura/papel
				if (escolhaJogador2 == tesoura) {
					System.out.println("Vitória do jogador 1, pedra vence tesoura!");
				} else if (escolhaJogador2 == papel) {
					System.out.println("Vitória do jogador 2, papel vence pedra!");
				}
				break;
			case 2:	//Papel vs pedra/tesoura
				if (escolhaJogador2 == pedra) {
					System.out.println("Vitória do jogador 1, papel vence pedra!");
				} else if (escolhaJogador2 == tesoura) {
					System.out.println("Vitória do jogador 2, tesoura vence papel!");
				}
				break;
			case 3:	//Tesoura vs papel/pedra
				if (escolhaJogador2 == papel) {
					System.out.println("Vitória do jogador 1, tesoura vence papel!");
				} else if (escolhaJogador2 == pedra) {
					System.out.println("Vitória do jogador 2, pedra vence tesoura!");
				}
				break;
		}
	}
}
*/

//----------------------------------------------------------------------------------------------------------------------------------------

/*//Minha tentativa de algorítmo sem exito.
import java.util.Scanner;
public class ExercPedraPapelTesoura {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Esse é um jogo de pedra, papel, tesoura. Qual dos três você escolhe?");
		
		System.out.println("Escolha do primeiro jogador. (1)Pedra (2)Papel (3)Tesoura: ");
		int primeiraEscolha = in.nextInt();
		
		System.out.println("Escolha do segundo jogador. (1)Pedra (2)Papel (3)Tesoura: ");
		int segundaEscolha = in.nextInt();
		int escolhaJogadores = 0;
		
		if(primeiraEscolha == segundaEscolha) {
			System.out.println("Empate.");
		}
		if(primeiraEscolha == 1 && segundaEscolha == 2) {
			System.out.println("Pedra venceu!");
			System.out.println("O primeiro jogador escolheu " + primeiraEscolha + " e " + "o segundo jogador escolheu " + segundaEscolha + ".");
		}
		if(primeiraEscolha == 1 && segundaEscolha == 3) {
			System.out.println("Pedra venceu!");
			System.out.println("O primeiro jogador escolheu " + primeiraEscolha + " e " + "o segundo jogador escolheu " + segundaEscolha + ".");
		}
	}
}
*/