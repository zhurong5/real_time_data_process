package java20240719_wrapper;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CollectionEx07 {

	public static void main(String[] args) {
		// set : 집합 
		// 1. 순서가 없다
		// 2. 중복을 허용하지 않는다.
		Set<String> set = new HashSet<String>();
		// 저장
		set.add("오주영1");
		set.add("오주영2");
		set.add("오주영3");
		set.add("오주영4");
		set.add("오주영4");
		//
		System.out.println(set);
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
		for (String string : set) {
			System.out.println(string);
		}
		// 문자열 변환
		System.out.println(set.toString());
		// 데이터 유무
		System.out.println(set.contains("오주영1"));
		System.out.println(set.contains("오주영"));
		// 삭제
		set.remove("오주영1");
		for (String string : set) {
			System.out.println(string);
		}
		// 모두 삭제
		set.clear();
	}

}
