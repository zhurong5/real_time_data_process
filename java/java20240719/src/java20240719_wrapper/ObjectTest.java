package java20240719_wrapper;

public class ObjectTest {

	public static void main(String[] args) {
		Book book = new Book("산울림", "오주영");
		book.getAuthor();
		// 1회성
		new Book("아파트", "오주영");
	}

}
