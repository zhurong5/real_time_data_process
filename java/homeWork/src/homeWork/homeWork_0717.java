package homeWork;

public class homeWork_0717 {
	public static void main(String[] args) {
		homeWork_0717_Member member1 = new homeWork_0717_Member(1, "오주영", "서울", "010-1234-1234", 20000101, 'M');
		homeWork_0717_Member member2 = new homeWork_0717_Member(2, "오주영", "서울", "010-1234-1234", 20000101, 'M');
		homeWork_0717_Member member3 = new homeWork_0717_Member(3, "오주영", "서울", "010-1234-1234", 20000101, 'M');
		homeWork_0717_Member member4 = new homeWork_0717_Member(4, "오주영", "서울", "010-1234-1234", 20000101, 'M');
		homeWork_0717_Member member5 = new homeWork_0717_Member(5, "오주영", "서울", "010-1234-1234", 20000101, 'M');
		
		homeWork_0717_Product product1 = new homeWork_0717_Product(1, "computer", 10000, "컴퓨터다");
		homeWork_0717_Product product2 = new homeWork_0717_Product(1, "computer", 10000, "컴퓨터다");
		homeWork_0717_Product product3 = new homeWork_0717_Product(1, "computer", 10000, "컴퓨터다");
		homeWork_0717_Product product4 = new homeWork_0717_Product(1, "computer", 10000, "컴퓨터다");
		homeWork_0717_Product product5 = new homeWork_0717_Product(1, "computer", 10000, "컴퓨터다");
		
		homeWork_0717_Vote candidate1 = new homeWork_0717_Vote(1, "주영", 100);
		homeWork_0717_Vote candidate2 = new homeWork_0717_Vote(2, "주영", 200);
		homeWork_0717_Vote candidate3 = new homeWork_0717_Vote(3, "주영", 300);
		
		homeWork_0717_Payment payment1 = new homeWork_0717_Payment();
		payment1.setPurchaseNum(1);
		payment1.setCardnum(1010);
		payment1.setTotalPrice(10000);
		payment1.setAppldate("1월1일");
		payment1.setAppltime("1시 30분");
		
		System.out.println(payment1.purchaseNum);
		System.out.println(payment1.cardnum);
		System.out.println(payment1.totalPrice);
		System.out.println(payment1.appldate);
		System.out.println(payment1.appltime);
		
		homeWork_0717_Review review1 = new homeWork_0717_Review();
		review1.setReviewNum(1);
		review1.setScore(5);
		review1.setReviewDate("7월 17일");
		review1.setReviewContent("재밌습니다~");
		
		System.out.println(review1.getReviewNum());
		System.out.println(review1.getScore());
		System.out.println(review1.getReviewDate());
		System.out.println(review1.getReviewContent());
		
		homeWork_0717_Inquire inquire1 = new homeWork_0717_Inquire();
		inquire1.setInquireNum(1);
		inquire1.setInquireKind("심리상담");
		inquire1.setInquireSubject("지금 내가 뭔생각 하고있게요");
		inquire1.setInquireContent("상대방 생각 맞추기");
		inquire1.setInquireDate("7월 17일");
		inquire1.setInquireAnswer("집에가고싶다");
		inquire1.setInquireAnswerDate("7월 17일");
		
		System.out.println(inquire1.getInquireNum());
		System.out.println(inquire1.getInquireKind());
		System.out.println(inquire1.getInquireContent());
		System.out.println(inquire1.getInquireDate());
		System.out.println(inquire1.getInquireAnswer());
		System.out.println(inquire1.getInquireAnswerDate());
		
		homeWork_0717_ipgo ipgo = new homeWork_0717_ipgo();
		ipgo.setIpgoNum(1001);
        ipgo.setGoodsNum(2002);
        ipgo.setIpgoQty(300);
        ipgo.setIpgoDate("2024-07-17");
        ipgo.setMadeDate("2024-07-16");
        ipgo.setIpgoPrice(1500);
        ipgo.setGoodsPrice(1700);

        System.out.println("ipgoNum: " + ipgo.getIpgoNum());
        System.out.println("goodsNum: " + ipgo.getGoodsNum());
        System.out.println("ipgoQty: " + ipgo.getIpgoQty());
        System.out.println("ipgoDate: " + ipgo.getIpgoDate());
        System.out.println("madeDate: " + ipgo.getMadeDate());
        System.out.println("ipgoPrice: " + ipgo.getIpgoPrice());
        System.out.println("goodsPrice: " + ipgo.getGoodsPrice());
		
	}
	
}
