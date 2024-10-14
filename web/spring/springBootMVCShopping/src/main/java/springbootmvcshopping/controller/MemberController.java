package springbootmvcshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("member") // member/memberList 같이 절대주소로 쓰지 않아도 됨
public class MemberController {
	@GetMapping("memberList")
	public String list() {
		
		return "thymeleaf/member/memberList"; // html경로
		//return "member/memberList"; // jsp경로
	}
	
	@GetMapping("memberWrite")
	public String write() {
		
		return "thymeleaf/member/memberForm";
		//return "member/memberForm";
	}
	
	@PostMapping("memberRegist")
	public String regist() {
		return "redirect:memberList";
	}
}
