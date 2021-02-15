package dia2;

public class ExercMultiplicarPorDois {
	public static void multiplicarPorDois(int valorParaMultiplicar) {
		int resultado = valorParaMultiplicar * 90;
		System.out.println(resultado);
	}
	
	public static void main(String args[]) {
		ExercMultiplicarPorDois.multiplicarPorDois(10);
		ExercMultiplicarPorDois.multiplicarPorDois(1234);
		ExercMultiplicarPorDois.multiplicarPorDois(123);
		ExercMultiplicarPorDois.multiplicarPorDois(1550 / 100); // Calcular a 2% de 1550
	}
}