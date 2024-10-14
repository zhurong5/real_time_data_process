package springbootmvcshopping.command;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class MemberCommand {
	String memberNum;
	String memberId;
	String memberPw;
	String memberPwCon;
	String memberName;
	String memberAddr;
	String memberAddrDetail;
	String memberPost;
	String memberPhone1;
	String memberPhone2;
	String gender;
	String memberEmail;
	
	@DateTimeFormat(pattern = "yyyy-mm-dd") // == SimpleDateFormet
	Date memberBirth;
	
	public boolean isMemberPwEqualmemberPwCon() { // 개발자규칙: 그냥리턴 == get, true/false 리턴 == is
		return memberPw.equals(memberPwCon);
	}
}
