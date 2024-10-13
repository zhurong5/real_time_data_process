package jspMVCMisoShopping.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jspMVCMisoShopping.service.employee.EmployeeDeleteService;
import jspMVCMisoShopping.service.employee.EmployeeDetailService;
import jspMVCMisoShopping.service.employee.EmployeeListService;
import jspMVCMisoShopping.service.employee.EmployeeModifyService;
import jspMVCMisoShopping.service.employee.EmployeeWriteService;
import jspMVCMisoShopping.service.employee.employeeAuoWriteService;

public class EmployeeFrontController extends HttpServlet {
	
	protected void process (HttpServletRequest request, 
	HttpServletResponse response) throws ServletException, IOException {
		String requestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String command = requestURI.substring(contextPath.length());
		if (command.equals("/employeeList.emp")) {
			EmployeeListService action = new EmployeeListService();
			action.execute(request);
			RequestDispatcher dispatcher = 
					request.getRequestDispatcher("employee/employeeList.jsp");
			dispatcher.forward(request, response);
		} else if (command.equals("/employeeWrite.emp")) {
			employeeAuoWriteService action = new employeeAuoWriteService();
			action.execute(request);
			RequestDispatcher dispatcher = 
					request.getRequestDispatcher("employee/employeeForm.jsp");
			dispatcher.forward(request, response);
		} else if (command.equals("/employeeRegist.emp")) {
			EmployeeWriteService action = new EmployeeWriteService();
			action.execute(request);
			response.sendRedirect("employeeList.emp");
		} else if (command.equals("/employeeDetail.emp")) {
			EmployeeDetailService action = new EmployeeDetailService();
			action.execute(request);
			RequestDispatcher dispatcher = 
					request.getRequestDispatcher("employee/employeeInfo.jsp");
			dispatcher.forward(request, response);
		} else if(command.equals("/employeeUpdate.emp")) {
			EmployeeDetailService action = new EmployeeDetailService();
			action.execute(request);
			RequestDispatcher dispatcher = 
					request.getRequestDispatcher("employee/employeeModify.jsp");
			dispatcher.forward(request, response);
		}else if(command.equals("/employeeModify.emp")) {
			EmployeeModifyService action = new EmployeeModifyService();
			action.execute(request);
			response.sendRedirect("employeeDetail.emp?empNum=" +
							request.getParameter("empNum"));
		}else if(command.equals("/employeeDelete.emp")) {
			EmployeeDeleteService action = new EmployeeDeleteService();
			action.execute(request);
			response.sendRedirect("employeeList.emp");
		}
	}
	@Override
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}
	@Override
	protected void doPost(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}
}
