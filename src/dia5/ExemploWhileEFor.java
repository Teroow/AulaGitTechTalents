package dia5;

public class ExemploWhileEFor {
	public static void main(String[] args) {
		
		// Estruturas de Repetição:
		// while
		// do while (quase não é utilizado)
		// for
		// recursividade
		// servem para repetir blocos de código.
		
		
		//"While é: Pergunte primeiro, faça depois."
		/*
		int contagemWhile = 10;
		
  		while (contagemWhile < 10) {
			contagemWhile++;
			System.out.println(contagemWhile);
		}
		*/
  		
		
  		//"Do While é: Faça primeiro, pergunte depois."
  		/*
  		int contagemDoWhile = 10;
  		
  		do {
  			contagemDoWhile++;
  			System.out.println(contagemDoWhile);
  		} while (contagemDoWhile < 10);
  		*/
  		
  		
  		//For: É preciso passar os parâmetros dentro dos parênteses.
  		for (int i = 0; i <= 10; i++) {
  			System.out.println(i);
  		}
	}
}