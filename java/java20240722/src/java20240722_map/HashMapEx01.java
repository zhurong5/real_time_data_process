package java20240722_map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapEx01 {
	// map : 딕셔너리, json
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		// 1. 선언
		// key value key value
		Map<Integer, String> map = new HashMap<Integer, String>();
		// 2. 저장
		map.put(1, "오주영1");
		map.put(10, "오주영100");
		map.put(2, "오주영2");
		map.put(3, "오주영3");
		map.put(4, "오주영4");
		// 3. 수정
		map.put(4, "주영4"); // 키가 없으면 저장 있으면 수정
		map.replace(10, "오주영영");
		// 4. 요소 출력
		System.out.println(map.get(1));
		// 5. 키값 가져오기
		for (Integer key : map.keySet()) {
			System.out.println(map.get(key));
		}
		// 6. 모든 값 가져오기
		Collection<String> val = (Collection<String>) map.values();
		System.out.println("val : " + val);
		// 7. 크기
		System.out.println(map.size());
		// 8. 삭제
		map.remove(1);
		map.remove(10, "오주영100");
		System.out.println(map);
		// 9. 모두삭제
		map.clear();
		System.out.println(map.size());
	}

}
