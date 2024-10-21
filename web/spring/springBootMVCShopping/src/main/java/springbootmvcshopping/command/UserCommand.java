package springbootmvcshopping.command;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class UserCommand {
	String memberId;
	String memberPw;
	String memberName;
	String memberAddr;
	String memberAddrDetail;
	String memberPost;
	String memberPhone1;
	String memberPhone2;
	String gender;
	String memberEmail;
	@DateTimeFormat(pattern = "yyyy-mm-dd")
	Date memberBirth;
}
