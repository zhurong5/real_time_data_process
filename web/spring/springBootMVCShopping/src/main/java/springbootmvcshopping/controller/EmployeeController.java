package springbootmvcshopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import springbootmvcshopping.command.EmployeeCommand;
import springbootmvcshopping.command.MemberCommand;
import springbootmvcshopping.service.AutoNumService;
import springbootmvcshopping.service.employee.EmployeeDeleteService;
import springbootmvcshopping.service.employee.EmployeeDetailService;
import springbootmvcshopping.service.employee.EmployeeListService;
import springbootmvcshopping.service.employee.EmployeeUpdateService;
import springbootmvcshopping.service.employee.EmployeeWriteService;

@Controller
@RequestMapping("employee")
public class EmployeeController {
	@Autowired
	AutoNumService autoNumService;
	@Autowired
	EmployeeWriteService employeeWriteService;
	@Autowired
	EmployeeListService employeeListService;
	@Autowired
	EmployeeDetailService employeeDetailService;
	@Autowired
	EmployeeUpdateService employeeUpdateService;
	@Autowired
	EmployeeDeleteService employeeDeleteService;
	
	@GetMapping("employeeList")
	public String list(@RequestParam(value = "searchWord", required = false) String searchWord,
					   @RequestParam(value = "page", required = false, defaultValue = "1") Integer page,
			
			Model model) {
		employeeListService.execute(page, searchWord, model);
		return "thymeleaf/employee/employeeList";
	}
	@GetMapping("employeeWrite")
	public String write(Model model) {
		String autoNum = autoNumService.execute("emp_", "emp_num", 5, "employees");
		EmployeeCommand employeeCommand = new EmployeeCommand();
		employeeCommand.setEmpNum(autoNum);
		model.addAttribute("employeeCommand", employeeCommand);
		return "thymeleaf/employee/employeeForm";
	}
	
	@PostMapping("employeeRegist")
	public String write(@Validated EmployeeCommand employeeCommand, BindingResult result) {
		if (result.hasErrors()) {
			return "thymeleaf/employee/employeeForm";
		}
		if (!employeeCommand.isEmployeePwEqualEmployeePwCon()) {
			result.rejectValue("empPwCon", "employeeCommand.empPwCon", "비밀번호가 일치하지 않습니다");
			return "thymeleaf/employee/employeeForm";
		}
		employeeWriteService.execute(employeeCommand);
		return "redirect:employeeList";
	}
	
	@GetMapping("employeeDetail/{empNum}")
	public String employeeDetail(@PathVariable("empNum") String empNum
			, Model model) {
		employeeDetailService.execute(empNum, model);
		return "thymeleaf/employee/employeeInfo";
	}
	
	@GetMapping("employeeUpdate")
	public String employeeUpdate(String empNum, Model model) {
		employeeDetailService.execute(empNum, model);
		return "thymeleaf/employee/employeeModify";
	}
	
	@PostMapping("employeeUpdate")
	public String employeeUpdate(@Validated EmployeeCommand employeeCommand) {
		employeeUpdateService.execute(employeeCommand);
		return "redirect:employeeDetail/"+employeeCommand.getEmpNum();
	}
	
	@GetMapping("employeeDelete/{empNum}")
	public String employeeDelete(@PathVariable("empNum") String empNum) {
		employeeDeleteService.execute(empNum);
		return "redirect:../employeeList";
	}
}
