package java20240719_wrapper;

import java.util.ArrayList;
import java.util.List;

public class Collection {
	public static void main(String[] args) {
		// 변수 단점 : 하나의 값만 저장
		// 배열 장점 : 하나 이상의 값을 저장
		//	   단점 : 크기를 변경할 수 없다.
		//			 하나의 타입만 가능하다
		// Collection 장점 : 크기가 유동적이다
		//			  단점 : 하나의 타입만 가능하다.
		// list , set
		int i [] = new int[4];
		String str[] = new String[3];
		str[0] = "오주영";
		str[1] = "주영오";
		str[2] = "영주오";
		System.out.println(str.length);
		List<String> list = new ArrayList<String>();
		list.add("오주영");
		list.add("주영오");
		list.add("영주오");
		System.out.println(list.size());
		for (String string : str) {
			System.out.println(string);
		}
		for (String string : list) {
			System.out.println(string);
		}
		System.out.println(str[1]);
		System.out.println(list.get(1));
		list.remove(0);
		System.out.println(list.get(0));
		list.remove("주영오");
		for (String string : list) {
			System.out.println(string);
		}
		list.clear();
	}
}
