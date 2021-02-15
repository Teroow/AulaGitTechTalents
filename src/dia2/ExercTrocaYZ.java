package dia2;

public class ExercTrocaYZ {
	public static void main(String[] args) {
		int y = 99;
		int z = 11;
		int auxiliar = 0;
		
		System.out.println("Antes da troca, y valia " + y);
		System.out.println("Antes da troca, z valia " + z);
		
		auxiliar = y;
		y = z;
		z = auxiliar;
		
		System.out.println("Depois da troca, y vale " + y);
		System.out.println("Depois da troca, z vale " + z);
	}
}
