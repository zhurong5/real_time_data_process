package springbootmvcshopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import springbootmvcshopping.command.MemberCommand;
import springbootmvcshopping.service.member.MemberWriteService;

@Controller
@RequestMapping("member") // member/memberList 같이 절대주소로 쓰지 않아도 됨
public class MemberController {
	@Autowired
	MemberWriteService memberWriteService;
	
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
	public String wirte(MemberCommand memberCommand, Model model) {
		if (!memberCommand.isMemberPwEqualmemberPwCon()) {
			model.addAttribute("errPw","비밀번호가 일치하지 않습니다.");
			return "thymeleaf/member/memberForm";
		}
		memberWriteService.execute(memberCommand);
		return "redirect:memberList";
	}
}
