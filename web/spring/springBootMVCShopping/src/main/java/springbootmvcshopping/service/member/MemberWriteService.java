package springbootmvcshopping.service.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import springbootmvcshopping.command.MemberCommand;
import springbootmvcshopping.domain.MemberDTO;
import springbootmvcshopping.mapper.MemberMapper;

@Service
public class MemberWriteService {
	@Autowired
	MemberMapper memberMapper;
	@Autowired
	PasswordEncoder passwordEncoder;
	
	public void execute(MemberCommand memberCommand) {
		MemberDTO dto = new MemberDTO();
		dto.setGender(memberCommand.getGender());
		dto.setMemberAddr(memberCommand.getMemberAddr());
		dto.setMemberAddrDetail(memberCommand.getMemberAddrDetail());
		dto.setMemberBirth(memberCommand.getMemberBirth());
		dto.setMemberEmail(memberCommand.getMemberEmail());
		dto.setMemberId(memberCommand.getMemberId());
		dto.setMemberName(memberCommand.getMemberName());
		dto.setMemberNum(memberCommand.getMemberNum());
		dto.setMemberPhone1(memberCommand.getMemberPhone1());
		dto.setMemberPhone2(memberCommand.getMemberPhone2());
		dto.setMemberPost(memberCommand.getMemberPost());
		// encode: 암호화
		String encodePw = passwordEncoder.encode(memberCommand.getMemberPw());
		dto.setMemberPw(encodePw);
		memberMapper.memberInsert(dto);
	}
}
