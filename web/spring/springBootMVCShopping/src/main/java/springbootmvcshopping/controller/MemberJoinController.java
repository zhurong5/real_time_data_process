package springbootmvcshopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import springbootmvcshopping.command.UserCommand;
import springbootmvcshopping.service.memberJoin.MemberJoinService;

@Controller
@RequestMapping("register")
public class MemberJoinController {
	@Autowired
	MemberJoinService memberJoinService;
	@GetMapping("userAgree")
	public String agree() {
		return "thymeleaf/memberJoin/agree";
	}
	
	@GetMapping("userWrite")
	public String userWrite() {
		return "thymeleaf/memberJoin/userForm";
	}
	
	@PostMapping("userWrite")
	public String userWrite(UserCommand userCommand) {
		memberJoinService.execute(userCommand);
		return "thymeleaf/memberJoin/welcome";
	}
}
