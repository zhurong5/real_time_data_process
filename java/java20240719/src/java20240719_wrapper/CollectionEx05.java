package java20240719_wrapper;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionEx05 {

	public static void main(String[] args) {
		// 선언
		List<Book> list = new ArrayList<Book>();
		// 저장
		list.add(new Book("태백산맥", "오주영"));
		list.add(new Book("아파트", "주영"));
		list.add(new Book("강아지", "영주오"));
		list.add(new Book("고양이", "영주오"));
		// 수정
		list.set(0, new Book("상록수", "오주영2"));
		// 출력
		System.out.println(list.get(1).getAuthor());
		String author = list.get(1).getAuthor()	;
		System.out.println(author);
		// 모두출력
		System.out.println(list);
		// 크기
		System.out.println(list.size());
		// 삭제
		list.remove(0); // index로 삭제
		for(int idx = 0; idx < list.size(); idx++) {
			if (list.get(idx).getAuthor() == "오주영") {
				list.remove(idx);
				break;
			}
		}
		for (Book book : list) {
			if (book.getAuthor() == "주영") {
				list.remove(book);
				break;
			}
		}
		System.out.println(list);
		//반복문
		for (Book book : list) {
			System.out.println(book);
		}
		// 모두 삭제
		list.clear();
	}

}
