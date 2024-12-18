package springbootmvcshopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpSession;
import springbootmvcshopping.command.LoginCommand;
import springbootmvcshopping.service.IdCheckService;
import springbootmvcshopping.service.login.UserLoginService;

@Controller
@RequestMapping("login")
public class LoginController {
	@Autowired
	IdCheckService idCheckService;
	@Autowired
	UserLoginService userLoginService; 
	//spring 방식
	@PostMapping("userIdCheck")
	public @ResponseBody Integer userIdCheck(String userId) {
		// html, jsp파일경로(x)
		return idCheckService.execute(userId);
	}
	
	@PostMapping("login")
	public String login(@Validated LoginCommand loginCommand
			,BindingResult result
			,HttpSession session) {
		userLoginService.execute(loginCommand, session, result);
		if (result.hasErrors()) {
			return "thymeleaf/index";
		}
		return "redirect:/";
	}
	
	@GetMapping("logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
}
