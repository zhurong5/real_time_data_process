package java20240722_wrapper;

public class WrapperEx01 {

	public static void main(String[] args) {
		
		byte b;
		short sh;
		int i;
		long l;
		float f;
		double d;
		boolean bl;
		char ch;
		
		Byte b1 = null;
		Short sh1;
		Integer i1;
		Long l1;
		Float f1;
		Double d1;
		Boolean bl1;
		Character ch1;
		
		String str = "10";
		i = Integer.parseInt(str);
		System.out.println(i);
		// null 값 처리 / 문자열을 리터널로 변환
		d = Double.parseDouble(str);
		System.out.println(d);
	}

}
