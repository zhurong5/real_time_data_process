package jspMVCMisoShopping.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jspMVCMisoShopping.service.help.FindIdService;

public class HelpFrontController extends HttpServlet {
	protected void doProcess(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		String requestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String command = requestURI.substring(contextPath.length());
		if (command.equals("/idInquiry.help")) {
			RequestDispatcher dispatcher = 
					request.getRequestDispatcher("help/findId.jsp");
			dispatcher.forward(request, response);
		} else if (command.equals("/idFind.help")) {
			FindIdService action = new FindIdService();
			action.execute(request);
			RequestDispatcher dispatcher = 
					request.getRequestDispatcher("help/findIdOk.jsp");
			dispatcher.forward(request, response);
		} else if (command.equals("/pwInquiry.help")) {
			RequestDispatcher dispatcher =
					request.getRequestDispatcher("help/findPw.jsp");
			dispatcher.forward(request, response);
		} else if (command.equals("/findPwOk.help")) {
			FindIdService action = new FindIdService();
			action.execute(request);
			
			RequestDispatcher dispatcher =
					request.getRequestDispatcher("help/findPwOk.jsp");
			dispatcher.forward(request, response);
		}
	}
	
	@Override
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}
	@Override
	protected void doPost(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}
}
