package dia4;

import java.util.Scanner;
public class NextENextLine {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite o seu nome: ");
		String primeiroNome = in.nextLine(); 
		System.out.println(primeiroNome);
		
		System.out.println("Digite o seu nome: ");
		String nome = in.next();
		System.out.println(nome);
		
		in.close();
		
	}
}