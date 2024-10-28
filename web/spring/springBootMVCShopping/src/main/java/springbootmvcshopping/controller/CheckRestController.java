package springbootmvcshopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpSession;
import springbootmvcshopping.service.EmailCheckService;
import springbootmvcshopping.service.FileDeleteService;

//spring boot
@RestController
public class CheckRestController {
	@Autowired
	EmailCheckService emailCheckService;
	@Autowired
	FileDeleteService fileDeleteService;
	@PostMapping("/checkRest/userEmailCheck")
	public Integer emailCheck(String userEmail) {
		return emailCheckService.execute(userEmail);
	}
	@RequestMapping("/file/fileDel")
	public @ResponseBody int fileDel(String orgFile, String storeFile, HttpSession session) {
		return fileDeleteService.execute(orgFile, storeFile, session);
	}
}
