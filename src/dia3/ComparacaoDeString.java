package dia3;

public class ComparacaoDeString {
	public static void main(String[] args) {
		String a = "ASD";
		String b = "AS";
		b = b + "D";
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		
		System.out.println(a == b);
		System.out.println(a.equals(b));
	}
}