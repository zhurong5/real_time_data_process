package springbootmvcshopping.service.memberJoin;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springbootmvcshopping.command.UserCommand;
import springbootmvcshopping.domain.MemberDTO;
import springbootmvcshopping.mapper.UserMapper;

@Service
public class MemberJoinService {
	@Autowired
	UserMapper userMapper;
	public void execute(UserCommand userCommand) {
		MemberDTO dto = new MemberDTO();
		BeanUtils.copyProperties(userCommand, dto);
		userMapper.userInsert(dto);
	}
}
