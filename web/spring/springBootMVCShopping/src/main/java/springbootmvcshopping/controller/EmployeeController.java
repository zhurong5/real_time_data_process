package springbootmvcshopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import springbootmvcshopping.command.EmployeeCommand;
import springbootmvcshopping.service.employee.EmployeeDeleteService;
import springbootmvcshopping.service.employee.EmployeeDetailService;
import springbootmvcshopping.service.employee.EmployeeListService;
import springbootmvcshopping.service.employee.EmployeeUpdateService;
import springbootmvcshopping.service.employee.EmployeeWriteService;

@Controller
@RequestMapping("employee")
public class EmployeeController {
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
	public String list(Model model) {
		employeeListService.execute(model);
		return "thymeleaf/employee/employeeList";
	}
	@GetMapping("employeeWrite")
	public String write() {
		
		return "thymeleaf/employee/employeeForm";
	}
	
	@PostMapping("employeeRegist")
	public String write(EmployeeCommand employeeCommand) {
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