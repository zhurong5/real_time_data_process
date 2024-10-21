package springbootmvcshopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import springbootmvcshopping.command.UserCommand;
import springbootmvcshopping.service.memberJoin.MemberJoinService;

@Controller
@RequestMapping("register")
public class MemberJoinController {
	@Autowired
	MemberJoinService memberJoinService;
	@ModelAttribute
	public UserCommand userCommand() {
		return new UserCommand();
	}
	@GetMapping("userAgree")
	public String agree() {
		return "thymeleaf/memberJoin/agree";
	}
	
	@GetMapping("userWrite")
	public String userWrite() {
		return "thymeleaf/memberJoin/userForm";
	}
	
	@PostMapping("userWrite")
	// @Validated : 유효성 검사
	public String userWrite(@Validated UserCommand userCommand
			,BindingResult result) {
		if (result.hasErrors()) {
			return "thymeleaf/memberJoin/userForm";
		}
		memberJoinService.execute(userCommand);
		return "thymeleaf/memberJoin/welcome";
	}
}
