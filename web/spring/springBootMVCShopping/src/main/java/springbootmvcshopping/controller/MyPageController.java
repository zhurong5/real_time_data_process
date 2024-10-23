package springbootmvcshopping.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpSession;
import springbootmvcshopping.command.EmployeeCommand;
import springbootmvcshopping.service.employee.EmployeeInfoService;
import springbootmvcshopping.service.employee.EmployeeUpdateService;
import springbootmvcshopping.service.myPage.EmployeeModifyService;
import springbootmvcshopping.service.myPage.EmployeePwUpdateService;

import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("myPage")
public class MyPageController {
	@Autowired
	EmployeeInfoService employeeInfoService;
	@Autowired
	EmployeeModifyService employeeModifyService;
	@Autowired
	EmployeePwUpdateService employeePwUpdateService;
	@GetMapping("empModify")
	public @ResponseBody Map<String, Object> empPage(HttpSession session, Model model) {
		Map<String, Object> map = employeeInfoService.execute(session, model);
		return map;
	}
	@PostMapping("empModify")
	public String empModify(EmployeeCommand employeeCommand, HttpSession session) {
		employeeModifyService.execute(employeeCommand, session);
		return "redirect:employeeMyPage";
	}
	
	@GetMapping("employeeMyPage")
	public String empMyPage() {
		return "thymeleaf/myPage/employeeInfo";
	}
	
	@PostMapping("empMyPage")
	// jsp
	public ModelAndView empayPage(HttpSession session, Model model) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("jsonView");
		employeeInfoService.execute(session, model);
		return mav;
	}
	
	@PostMapping("empPro")
	public String empPwPro(@RequestParam("oldPw") String oldPw, String newPw
			,HttpSession session) {
		employeePwUpdateService.execute(oldPw, newPw, session);
		return "redirect:employeeMyPage";
	}
	
}	
