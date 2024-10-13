package java20240715;

public class Ex05 {

	public static void main(String[] args) {
		Ex05_Board board = new Ex05_Board();
		board.setData(1, "제목1", "내용1", "오주영");
		board.print();
		Ex05_Board board1 = new Ex05_Board();
		board1.setData(2, "제목2", "내용2", "주영");
		board1.print();
		board1.setSubject("제목제목");
		board1.print();
		int num = board1.getNum(); // 호풀매서드
		System.out.println(num);
		System.out.println(board1.getNum());
	}

}
