package java20240719_wrapper;

import java.util.ArrayList;
import java.util.List;

public class CollectionEx06 {

	public static void main(String[] args) {
		Object obj = 10;
		System.out.println(obj);
		obj = "오주영";
		System.out.println(obj);
		obj = new Book("상록수", "오주영");
		System.out.println(((Book)obj).getBookname());
		List<Object> list = new ArrayList<Object>();
		list.add(10);
		list.add("오주영");
		list.add(new Book("고양이","주영"));
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(((Book)obj).getBookname());
		System.out.println("==============");
		List list1 = new ArrayList<>();
		list1.add(10);
		list1.add("오주영");
		list1.add(new Book("강아지","주영"));
		System.out.println(list1.get(0));
		System.out.println(list1.get(1));
		System.out.println(list1.get(2));
		System.out.println(((Book)list1.get(2)).getBookname());
	}

}
