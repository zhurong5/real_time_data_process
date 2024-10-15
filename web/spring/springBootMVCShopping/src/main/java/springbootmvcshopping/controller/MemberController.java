package springbootmvcshopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springbootmvcshopping.command.MemberCommand;
import springbootmvcshopping.service.AutoNumService;
import springbootmvcshopping.service.member.MemberWriteService;
import springbootmvcshopping.service.member.MemberDeleteService;
import springbootmvcshopping.service.member.MemberListService;

@Controller
@RequestMapping("member") // 공통주소 처리
public class MemberController {
	@Autowired
	MemberWriteService memberWriteService;
	@Autowired
	AutoNumService autoNumService;
	@Autowired
	MemberListService memberListService;
	@Autowired
	MemberDeleteService memberDeleteService;
	
	@GetMapping("memberList")
	public String list(@RequestParam(value = "searchWord", required = false) String searchWord,
	        		   @RequestParam(value = "page", required = false, defaultValue = "1") Integer page,
	        Model model) {
		memberListService.execute(page, searchWord, model);
		return "thymeleaf/member/memberList"; // html경로
		//return "member/memberList"; // jsp경로
	}
	
	@GetMapping("memberWrite")
	public String write(Model model) {
		String autoNum = autoNumService.execute("mem_", "member_num", 5, "members");
		MemberCommand memberCommand = new MemberCommand();
		memberCommand.setMemberNum(autoNum);
		model.addAttribute("memberCommand", memberCommand);
		return "thymeleaf/member/memberForm";
		//return "member/memberForm";
	}
	
	@PostMapping("memberRegist")
	public String wirte(@Validated MemberCommand memberCommand, BindingResult result
			/*, Model model*/) { // BindingResult는 무조건 command뒤에
		if (result.hasErrors()) {
			return "thymeleaf/member/memberForm";
		}
		if (!memberCommand.isMemberPwEqualmemberPwCon()) {
			// model.addAttribute("errPw","비밀번호가 일치하지 않습니다.");
			result.rejectValue("memberPwCon", "memberCommand.memberPwCon", 
					"비밀번호가 일치하지 않습니다.");
			return "thymeleaf/member/memberForm";
		}
		memberWriteService.execute(memberCommand);
		return "redirect:memberList";
	}
	@RequestMapping(value = "membersDelete")
	public String memberDelete(@RequestParam("nums") String memberNums []) {
		memberDeleteService.execute(memberNums);
		return "redirect:memberList";
	}
}
