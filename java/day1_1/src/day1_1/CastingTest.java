package day1_1;

public class CastingTest {

	public static void main(String[] args) {
		byte b = 100;
		int i = -2100000000;
		System.out.println(b);
		System.out.println(i);
		i = b; // byte => int // 자동형변환
		System.out.println(i);
		double d = b;
		System.out.println(d); // byte => double
		// byte => short => int => long => float
		//						=> float => double
		b = (byte)i;
		System.out.println(b);
		i = 128;
		b = (byte)i;
		System.out.println(b);
		i = 129;
		b = (byte)i;
		System.out.println(b);
		
	}

}
