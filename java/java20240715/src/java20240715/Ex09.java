package java20240715;

public class Ex09 {

	public static void main(String[] args) {
		// 3명의 회원을 입력하시오
		// 2명은 생성자를 이용해서 초기화
		// 1명은 기본생성자를 이용해서 객체생성한 후 초기화

		Ex09_Member member1 = new Ex09_Member();
		member1.setNum(1);
		member1.setName("오주롱");
		member1.setId("zhurong");
		member1.setPassWord("1111");
		member1.setPhone("111");
		member1.setAddr("서울");
		member1.setGender('M');
		Ex09_Member member2 = new Ex09_Member(2, "주영", "rong5", "2222", "222", "경기", 'M');
		Ex09_Member member3 = new Ex09_Member(3, "오주영", "rong", "3333", "333", "경기", 'M');

		member1.print();
		member2.print();
		member3.print();

	}

}
