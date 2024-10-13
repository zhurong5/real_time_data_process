package java20240719_wrapper;

import java.util.ArrayList;
import java.util.List;

public class CollectionEx02 {

	public static void main(String[] args) {
		// 선언
		List<String> list = new ArrayList<String>();
		// 저장
		list.add("오주영1");
		list.add("오주영2");
		list.add("오주영3");
		list.add("오주영4");
		list.add("오주영5");
		list.add("오주영6");
		// 수정
		list.set(0, "주영1");
		// 출력
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		System.out.println(list.get(4));
		System.out.println(list.get(5));
		// 크기
		System.out.println(list.size());
		// 삭제
		String string1 = list.remove(0); // index로 삭제
		System.out.println(string1);
		list.remove("오주영2"); // object로 삭제
		// 모두 삭제
		list.clear();
		// 문자열로 변환
		String string = list.toString();
		System.out.println(string);
		// 반복문
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		for (String str : list) {
			System.out.println(str);
		}

	}

}
