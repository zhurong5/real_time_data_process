package java20240715;

// 회원 가입
public class Ex09_Member {
	// 회원 번호
	// 회원 이름
	// 회원 아이디
	// 회원 비밀번호
	// 회원 연락처
	// 회원 주소
	// 회원 성별

	int num;
	String name;
	String id;
	String passWord;
	String phone;
	String addr;
	char gender;

	// 생성자 / 기본 생성자
	public Ex09_Member(int num, String name, String id, String passWord, String phone, String addr, char gender) {
		this.num = num;
		this.name = name;
		this.id = id;
		this.passWord = passWord;
		this.phone = phone;
		this.addr = addr;
		this.gender = gender;
	}

	public Ex09_Member() {

	}

	// setter / getter
	public void setNum(int num) {
		this.num = num;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getNum() {
		return num;
	}

	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	public String getPassWord() {
		return passWord;
	}

	public String getPhone() {
		return phone;
	}

	public String getAddr() {
		return addr;
	}

	public char getGender() {
		return gender;
	}

	// print
	public void print() {
		System.out.println(num);
		System.out.println(name);
		System.out.println(id);
		System.out.println(passWord);
		System.out.println(phone);
		System.out.println(addr);
		System.out.println(gender);
	}
}
