package springbootmvcshopping.command;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class EmployeeCommand {
	String empNum;
	String empName;
	String empId;
	String empPw;
	String empPwCon;
	String empAddr;
	String empAddrDetail;
	String empPost;
	String empPhone;
	String empJumin;
	String empEmail;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	Date empHireDate;
}
