package springbootmvcshopping.domain;

import java.util.Date;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("memberDTO")
public class MemberDTO {
	// table에 있는 칼럼이름과 같아야 한다
	String memberNum;
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
	Date memberBirth;
	Date memberRegist;
	
	String memberEmailConf;
}
