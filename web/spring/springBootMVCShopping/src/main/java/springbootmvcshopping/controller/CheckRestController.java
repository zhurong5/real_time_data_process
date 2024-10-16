package springbootmvcshopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import springbootmvcshopping.service.EmailCheckService;

@RestController
public class CheckRestController {
	@Autowired
	EmailCheckService emailCheckService;
	@PostMapping("/checkRest/userEmailCheck")
	public Integer emailCheck(String userEmail) {
		emailCheckService.execute(userEmail);
		return 1;
	}
}
