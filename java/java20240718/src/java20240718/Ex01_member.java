package java20240718;

public class Ex01_member {
	int memberNum;
	String memberName;
	String memberAddr;
	String memberPhone;
	int memberBirth;
	char memberGender;
	// 생성자
	// 단축키 : Alt + Shift + s o
	// setter / getter
	// 단축키 : Alt + Shift + s r
	
	public Ex01_member(int memberNum, String memberName, String memberAddr, String memberPhone, int memberBirth,
			char memberGender) {
		super();
		this.memberNum = memberNum;
		this.memberName = memberName;
		this.memberAddr = memberAddr;
		this.memberPhone = memberPhone;
		this.memberBirth = memberBirth;
		this.memberGender = memberGender;
	}
	
	public int getMemberNum() {
		return memberNum;
	}
	public void setMemberNum(int memberNum) {
		this.memberNum = memberNum;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getMemberAddr() {
		return memberAddr;
	}
	public void setMemberAddr(String memberAddr) {
		this.memberAddr = memberAddr;
	}
	public String getMemberPhone() {
		return memberPhone;
	}
	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}
	public int getMemberBirth() {
		return memberBirth;
	}
	public void setMemberBirth(int memberBirth) {
		this.memberBirth = memberBirth;
	}
	public char getMemberGender() {
		return memberGender;
	}
	public void setMemberGender(char memberGender) {
		this.memberGender = memberGender;
	}
	

}
