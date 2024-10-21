package springbootmvcshopping.command;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class UserCommand {
	@NotEmpty(message = "아이디를 입력해주세요")
	String memberId;
	String memberPw;
	@NotBlank(message = "이름을 입력해주세요")
	String memberName;
	@NotBlank(message = "주소를 입력해주세요")
	String memberAddr;
	String memberAddrDetail;
	String memberPost;
	@NotBlank(message = "연락처를 입력해주세요")
	@Size(min = 11, max = 23)
	String memberPhone1;
	String memberPhone2;
	String gender;
	@NotBlank(message = "이메일을 입력해주세요")
	String memberEmail;
	@NotNull(message = "생년월일을 입력해주세요")
	@DateTimeFormat(pattern = "yyyy-mm-dd")
	Date memberBirth;
}
