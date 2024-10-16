package springbootmvcshopping.command;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class MemberCommand {
	// 자료형이 String : @NotEmpty, @NotBlank 사용가능
	// String이 아닌 자료형은 @NotNull이다
	String memberNum;
	@NotEmpty(message = "아이디를 입력해주세요")
	String memberId;
	@Pattern(regexp = "^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$",
			message = "영문자와 숫자 그리고 특수문자가 포함된 8글자 이상")
	String memberPw;
	@NotBlank(message = "비밀번호 확인을 입력해주세요") 
	String memberPwCon;
	@NotBlank(message = "이름을 입력해주세요") 
	String memberName;
	@NotBlank(message = "주소를 입력해주세요") 
	String memberAddr;
	String memberAddrDetail;
	String memberPost;
	@NotBlank(message = "전화번호를 입력해주세요")
	@Size(min = 11, max = 23) // 길이 검사
	String memberPhone1;
	String memberPhone2;
	String gender;
	@NotBlank(message = "이메일을 입력해주세요")
	String memberEmail;
	@NotNull(message = "생년월일을 입력해 주세요")
	@DateTimeFormat(pattern = "yyyy-mm-dd") // == SimpleDateFormet
	Date memberBirth;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	Date memberRegist;
	
	public boolean isMemberPwEqualmemberPwCon() { // 개발자규칙: 그냥리턴 == get, true/false 리턴 == is
		return memberPw.equals(memberPwCon);
	}
}
