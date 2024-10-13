package java20240711;

public class Ex05 {

	public static void main(String[] args) {
		int i[] = new int[4];
		for (int j : i) {
			System.out.println(j);
		}
		double d[] = new double[4];
		for (double e : d) {
			System.out.println(e);
		}
		boolean bl[] = new boolean[4];
		for (boolean b : bl) {
			System.out.println(b);
		}
		String str[] = new String[4];
		for (String string : str) {
			System.out.println(string);
		}
		char ch[] = new char[3];
		for (char c : ch) {
			System.out.println(c);
		}
		System.out.println(""); // blank로 저장됨
	}
}
