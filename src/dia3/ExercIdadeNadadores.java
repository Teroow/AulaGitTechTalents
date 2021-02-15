package dia3;

/*//Algor�tmo do professor usando "while" (com op��o de continuar ou encerrar o programa).
import java.util.Scanner;
public class ExercIdadeNadadores {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);		
		int continuarPrograma = 1;
		
		while(continuarPrograma == 1) {
		
			System.out.println("Digite a idade do nadador: ");
			int idade = in.nextInt();
						
			boolean semCategoria = idade < 5;
			boolean infantilA = idade >= 5 && idade <= 7;
			boolean infantilB = idade >= 8 && idade <= 11;
			boolean juvenilA = idade >= 12 && idade <= 13;
			boolean juvenilB = idade >= 14 && idade <= 17;
			
			if(semCategoria) {
				System.out.println("Infelizmente ainda n�o est� apto para ingressar.");
			} else if(infantilA) {
				System.out.println("Categoria: Infantil A.");
			} else if(infantilB) {
				System.out.println("Categoria: Infantil B.");
			} else if(juvenilA) {
				System.out.println("Categoria: Juvenil A.");
			} else if(juvenilB) {
				System.out.println("Categoria: Juvenil B.");
			} else {
				System.out.println("Categoria: Adultos.");
			}
	
			System.out.println("Deseja continuar o programa? Sim(1)/N�o(0)");
			continuarPrograma = in.nextInt();
		}
	}	
}
*/


/*//Algor�tmo usando boolean
import java.util.Scanner;
public class ExercIdadeNadadores {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);		
		
		System.out.println("Digite a idade do nadador: ");
		int idade = in.nextInt();
					
		boolean semCategoria = idade < 5;
		boolean infantilA = idade >= 5 && idade <= 7;
		boolean infantilB = idade >= 8 && idade <= 11;
		boolean juvenilA = idade >= 12 && idade <= 13;
		boolean juvenilB = idade >= 14 && idade <= 17;
		
		if(semCategoria) {
			System.out.println("Infelizmente ainda n�o est� apto para ingressar.");
		} else if(infantilA) {
			System.out.println("Categoria: Infantil A.");
		} else if(infantilB) {
			System.out.println("Categoria: Infantil B.");
		} else if(juvenilA) {
			System.out.println("Categoria: Juvenil A.");
		} else if(juvenilB) {
			System.out.println("Categoria: Juvenil B.");
		} else {
			System.out.println("Categoria: Adultos.");
		}
	}	
}
*/


/*//Algor�tmo do professor.
import java.util.Scanner;
public class ExercIdadeNadadores {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Digite a idade do aluno: ");
		int idade = in.nextInt();
		switch (idade) {
			case 1:
			case 2:
			case 3:
			case 4:
				System.out.println("Infelizmente ainda n�o se encaixa em nenhuma das categorias.");
				break;
			case 5:
			case 6:
			case 7:
				System.out.println("Voc� � da categoria: Infantil A.");
				break;
			case 8:
			case 9:
			case 10:
			case 11:
				System.out.println("Voc� � da categoria: Infantil B.");
				break;
			case 12:
			case 13:
				System.out.println("Voc� � da categoria: Juvenil A.");
				break;
			case 14:
			case 15:
			case 16:
			case 17:
				System.out.println("Voc� � da categoria: Juvenil B.");
				break;
			default:
				System.out.println("Voc� � da categoria: Adultos.");
				break;
		}
		
		in.close();
		
	}
}
*/


/*//Meu algor�tmo.
import java.util.Scanner;
public class ExercIdadeNadadores {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite a sua idade: ");
		int idade = in.nextInt();
		
		if(idade >= 5 && idade <= 7) {
			System.out.println("Voc� faz parte do grupo de nata��o Infantil A.");
		} else if(idade < 5) {
			System.out.println("Infelizmente voc� ainda � muito novo para nadar, tente novamente em alguns anos.");
		} else if(idade >= 8 && idade <= 11) {
			System.out.println("Voc� faz parte do grupo de nata��o Infantil B.");
		} else if(idade >= 12 && idade <= 13) {
			System.out.println("Voc� faz parte do grupo de nata��o Juvenil A.");
		} else if(idade >= 14 && idade <= 17) {
			System.out.println("Voc� faz parte do grupo de nata��o Juvenil B.");
		} else if(idade >= 18) {
			System.out.println("Voc� faz parte do grupo de nata��o Adultos.");
		}
	}
}
*/
