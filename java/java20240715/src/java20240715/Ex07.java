package java20240715;

public class Ex07 {

	public static void main(String[] args) {
		Ex07_Board board = new Ex07_Board(1, "제목1", "내용1", "오주영"); // 객체 생성
		//board.setData(1, "제목1", "내용1", "오주영"); // 초기화
		board.print();
		Ex07_Board board2 = new Ex07_Board();
	}

}
