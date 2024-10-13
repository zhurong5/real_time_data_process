package java20240719_wrapper;

import java.util.ArrayList;
import java.util.List;

public class CollectionEx03 {

	public static void main(String[] args) {
		// <type> : 제네릭타입
		// 문자열
		List<String>list = new ArrayList<String>();
		// 정수
		List<Integer> i = new ArrayList<Integer>();
		i.add(1);
		// 실수
		List<Double> d = new ArrayList<Double>();
		// 부울
		List<Boolean> b = new ArrayList<Boolean>();
	}

}
