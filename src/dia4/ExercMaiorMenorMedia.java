package dia4;

/*
Construa um algoritmo que leia 10 valores inteiros e positivos e:
- Encontre o maior valor
- Encontre o menor valor
- Calcule a média dos números lidos
*/

//Algorítmo do professor (com while).
import java.util.Scanner;

public class ExercMaiorMenorMedia {
    public static void main(String[] args) {

      Scanner in = new Scanner(System.in);
      
      int somaDosValores = 0;
      int menorValor = Integer.MAX_VALUE;
      int maiorValor = Integer.MIN_VALUE;
      

      for (int contador = 1; contador < 11; contador++ ) {
      
    	  System.out.println("Informe o " + contador + "° número.");
	      int valor = in.nextInt();
	      
	
	      if (valor > maiorValor) {
	        maiorValor = valor;
	      }
		  if (valor < menorValor) {
	      	menorValor = valor;
	      }
	      
		  somaDosValores += valor; // Explicar esse novo operador de atribuição
	      
      }

      System.out.println("O maior valor digitado foi: " + maiorValor);
      System.out.println("O menor valor digitado foi: " + menorValor);

      System.out.print("A média dos valores é: " + somaDosValores / 10.0);
     
	  in.close();
      
    }
}



/*//Algorítmo do professor.
import java.util.Scanner;

public class ExercMaiorMenorMedia {
    public static void main(String[] args) {

      Scanner in = new Scanner(System.in);

      int somaDosValores = 0;
      
      System.out.println("Informe o 1 num");
      int valor = in.nextInt();
      
      int menorValor = valor;
      int maiorValor = valor;
      somaDosValores += valor; // Explicar esse novo operador de atribuição

      System.out.println("Informe o 2 num");
      valor = in.nextInt();
      if (valor > maiorValor) {
        maiorValor = valor;
      }
	  if (valor < menorValor) {
      	menorValor = valor;
      }
      somaDosValores += valor;

      System.out.println("Informe o 3 num");
      valor = in.nextInt();
      if (valor > maiorValor) {
      	maiorValor = valor;
      }
      if (valor < menorValor) {
        menorValor = valor;
      }
      somaDosValores += valor;

      System.out.println("Informe o 4 num");
      valor = in.nextInt();
      if (valor > maiorValor) {
        maiorValor = valor;
      }
      if (valor < menorValor) {
        menorValor = valor;
      }
      somaDosValores += valor;

      System.out.println("Informe o 5 num");
      valor = in.nextInt();
      if (valor > maiorValor) {
        maiorValor = valor;
      }
      if (valor < menorValor) {
        menorValor = valor;
      }
	  somaDosValores += valor;

	  System.out.println("Informe o 6 num");
      valor = in.nextInt();
      if (valor > maiorValor) {
        maiorValor = valor;
      }
      if (valor < menorValor) {
        menorValor = valor;
      }
      somaDosValores += valor;
      
      System.out.println("Informe o 7 num");
      valor = in.nextInt();
      if (valor > maiorValor) {
        maiorValor = valor;
      }
      if (valor < menorValor) {
        menorValor = valor;
      }
      somaDosValores += valor;

      System.out.println("Informe o 8 num");
      valor = in.nextInt();
      if (valor > maiorValor) {
        maiorValor = valor;
      }
      if (valor < menorValor) {
        menorValor = valor;
      }
      somaDosValores += valor;

      System.out.println("Informe o 9 num");
      valor = in.nextInt();
      if (valor > maiorValor) {
        maiorValor = valor;
      }
      if (valor < menorValor) {
        menorValor = valor;
      }
      somaDosValores += valor;

      System.out.println("Informe o 10 num");
      valor = in.nextInt();
      if (valor > maiorValor) {
        maiorValor = valor;
      }
      if (valor < menorValor) {
        menorValor = valor;
      }
      somaDosValores += valor;

      System.out.println("O maior valor digitado foi: " + maiorValor);
      System.out.println("O menor valor digitado foi: " + menorValor);

      System.out.print("A média dos valores é: " + somaDosValores / 10.0);

    }
}
*/


/*//Meu algorítmo
import java.util.Scanner;
public class ExercMaiorMenorMedia {
	public static void main(String[] args) {
		
		int menorValor = Integer.MAX_VALUE;
		int maiorValor = Integer.MIN_VALUE;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite o valor 1: ");
		int valor1 = in.nextInt();
		
		System.out.println("Digite o valor 2: ");
		int valor2 = in.nextInt();
		
		System.out.println("Digite o valor 3: ");
		int valor3 = in.nextInt();
		
		System.out.println("Digite o valor 4: ");
		int valor4 = in.nextInt();
		
		System.out.println("Digite o valor 5: ");
		int valor5 = in.nextInt();
		
		System.out.println("Digite o valor 6: ");
		int valor6 = in.nextInt();
		
		System.out.println("Digite o valor 7: ");
		int valor7 = in.nextInt();
		
		System.out.println("Digite o valor 8: ");
		int valor8 = in.nextInt();
		
		System.out.println("Digite o valor 9: ");
		int valor9 = in.nextInt();
		
		System.out.println("Digite o valor 10: ");
		int valor10 = in.nextInt();
			
		
		if(maiorValor < valor1) {
			maiorValor = valor1;
		}
		if(maiorValor < valor2) {
			maiorValor = valor2;			
		}
		if(maiorValor < valor3) {
			maiorValor = valor3;			
 		}
		if(maiorValor < valor4) {
			maiorValor = valor4;			
		}
		if(maiorValor < valor5) {
			maiorValor = valor5;			
		}
		if(maiorValor < valor6) {
			maiorValor = valor6;			
		}
		if(maiorValor < valor7) {
			maiorValor = valor7;			
		}
		if(maiorValor < valor8) {
			maiorValor = valor8;			
		}
		if(maiorValor < valor9) {
			maiorValor = valor9;			
		}
		if(maiorValor < valor10) {
			maiorValor = valor10;			
		}
			
		
		if(menorValor >  valor1) {
			menorValor = valor1;
		}
		if(menorValor >  valor2) {
			menorValor = valor2;			
		} 
		if(menorValor >  valor3) {
			menorValor = valor3;			
 		}
		if(menorValor >  valor4) {
 			menorValor = valor4;			
		}
		if(menorValor >  valor5) {
			menorValor = valor5;			
		}
		if(menorValor >  valor6) {
			menorValor = valor6;			
		}
		if(menorValor >  valor7) {
			menorValor = valor7;			
		}
		if(menorValor >  valor8) {
			menorValor = valor8;			
		}
		if(menorValor >  valor9) {
			menorValor = valor9;			
		} 
		if(menorValor >  valor10) {
			menorValor = valor10;			
		}
		
		System.out.println("O maior valor digitado foi: " + maiorValor + ".");
		System.out.println("O menor valor digitado foi: " + menorValor + ".");
		int media = (valor1 + valor2 + valor3 + valor4 +  valor5 +  valor6 +  valor7 +  valor8 +  valor9 +  valor10) / 10;
		System.out.println("A média dos valores digitados foi: " + media + ".");
		
		in.close();
		
	}
}
*/