package springbootmvcshopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import springbootmvcshopping.service.EmailCheckService;

//spring boot
@RestController
public class CheckRestController {
	@Autowired
	EmailCheckService emailCheckService;
	@PostMapping("/checkRest/userEmailCheck")
	public Integer emailCheck(String userEmail) {
		return emailCheckService.execute(userEmail);
	}
}
