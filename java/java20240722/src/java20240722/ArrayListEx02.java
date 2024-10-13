package java20240722;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx02 {

	public static void main(String[] args) {
		// 1. 선언
		List<String> list = new ArrayList<String>();
		// 2. 저장
		list.add("오주영1");
		list.add("주영오2");
		list.add("영주오3");
		list.add("오영주4");
		list.add("영오주5");
		// 3. 출력
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		// 4. 수정
		list.set(2, "주오영");
		// 5. 크기
		System.out.println(list.size());
		// 6. 삭제
		list.remove("영오주");
		System.out.println(list.size());
		// 7. pop : 값을 반환받으면서 삭제
		String pop = list.remove(3);
		System.out.println(pop);
		System.out.println(list.size());
		// 8. 모두 출력
		System.out.println(list);
		for (String string : list) {
			System.out.println(string);
		}
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		// 9. 문자열 변환
		String result = list.toString();
		System.out.println(result);
		// 10. 모두 삭제
		list.clear();
	}

}
