package dia5;

public class ExemploWhileEFor {
	public static void main(String[] args) {
		
		// Estruturas de Repeti��o:
		// while
		// do while (quase n�o � utilizado)
		// for
		// recursividade
		// servem para repetir blocos de c�digo.
		
		
		//"While �: Pergunte primeiro, fa�a depois."
		/*
		int contagemWhile = 10;
		
  		while (contagemWhile < 10) {
			contagemWhile++;
			System.out.println(contagemWhile);
		}
		*/
  		
		
  		//"Do While �: Fa�a primeiro, pergunte depois."
  		/*
  		int contagemDoWhile = 10;
  		
  		do {
  			contagemDoWhile++;
  			System.out.println(contagemDoWhile);
  		} while (contagemDoWhile < 10);
  		*/
  		
  		
  		//For: � preciso passar os par�metros dentro dos par�nteses.
  		for (int i = 0; i <= 10; i++) {
  			System.out.println(i);
  		}
	}
}