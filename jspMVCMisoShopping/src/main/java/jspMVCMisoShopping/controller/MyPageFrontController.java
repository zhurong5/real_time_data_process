package jspMVCMisoShopping.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jspMVCMisoShopping.model.dto.AuthInfoDTO;
import jspMVCMisoShopping.service.employee.EmployeeDeleteService;
import jspMVCMisoShopping.service.employee.EmployeeDetailService;
import jspMVCMisoShopping.service.member.MemberDetailService;
import jspMVCMisoShopping.service.member.MemberUpdateService;
import jspMVCMisoShopping.service.user.MemberPasswordService;
import jspMVCMisoShopping.service.user.memberDropService;

public class MyPageFrontController extends HttpServlet {
	
	private void doProcess(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		String requestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String command = requestURI.substring(contextPath.length());
		if (command.equals("/memberMyPage.my")) {
			System.out.println("memberMyPage.my");
			MemberDetailService action = new MemberDetailService();
			action.execute(request);
			RequestDispatcher dispatcher = 
					request.getRequestDispatcher("mypage/memberMyPage.jsp");
			dispatcher.forward(request, response);
		} else if (command.equals("/memberUpdate.my")) {
			MemberDetailService action = new MemberDetailService();
			action.execute(request);
			RequestDispatcher dispatcher =
					request.getRequestDispatcher("mypage/myModify.jsp");
			dispatcher.forward(request, response);
		} else if (command.equals("/memberModify.my")) {
			MemberUpdateService action = new MemberUpdateService();
			int i = action.execute(request);
			if (i == 1) {
				response.sendRedirect("memberMyPage.my");
			} else {
				MemberDetailService action1 = new MemberDetailService();
				action1.execute(request);
				RequestDispatcher dispatcher =
						request.getRequestDispatcher("mypage/myModify.jsp");
				dispatcher.forward(request, response);
			}
			
		} else if (command.equals("/userPwModify.my")) {
			RequestDispatcher dispatcher = 
					request.getRequestDispatcher("mypage/myPwCon.jsp");
			dispatcher.forward(request, response);
		} else if (command.equals("/memberPwModify.my")) {
			HttpSession session = request.getSession();
			AuthInfoDTO auth =(AuthInfoDTO)session.getAttribute("auth");
			String path = null;
			if (request.getParameter("memberPw").equals(auth.getUserPw())) {
				path = "mypage/myNewPw.jsp";
			}else {
				request.setAttribute("errPw", "비밀번호가 틀렸습니다.");
				path = "mypage/myPwCon.jsp";
			}
			RequestDispatcher dispatcher =
					request.getRequestDispatcher(path);
			dispatcher.forward(request, response);
		} else if (command.equals("/memberPwPro.my")) {
			MemberPasswordService action = new MemberPasswordService();
			int i = action.execute(request);
			if (i == 1) {
				response.sendRedirect("memberMyPage.my");
			}else {
				RequestDispatcher dispatcher =
						request.getRequestDispatcher("mypage/myPwCon.jsp");
				dispatcher.forward(request, response);
			}
		} else if (command.equals("/memberDrop.my")) {
			RequestDispatcher dispatcher =
					request.getRequestDispatcher("mypage/memberDrop.jsp");
			dispatcher.forward(request, response);
		} else if (command.equals("/memberDropOk.my")) {
			memberDropService action = new memberDropService();
			int i = action.execute(request);
			if (i == 1) {
				response.sendRedirect("logout.login");
			} else {
				RequestDispatcher dispatcher =
						request.getRequestDispatcher("mypage/memberDrop.jsp");
				dispatcher.forward(request, response);
			}
		} else if (command.equals("/empMyPage.my")) {
			EmployeeDetailService action = new EmployeeDetailService();
			action.execute(request);
			RequestDispatcher dispatcher =
					request.getRequestDispatcher("mypage/empMyPage.jsp");
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
