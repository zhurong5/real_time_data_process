package jspMVCMisoShopping.service.user;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import jspMVCMisoShopping.model.dao.UserDAO;
import jspMVCMisoShopping.model.dto.MemberDTO;

public class UserJoinService {
	public void execute(HttpServletRequest request) {
		try {
			request.setCharacterEncoding("utf-8");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		MemberDTO dto = new MemberDTO();
		dto.setGender(request.getParameter("gender"));
		dto.setMemberAddr(request.getParameter("memberAddr"));
		dto.setMemberAddrDetail(request.getParameter("memberAddrDetail"));
		dto.setMemberEmail(request.getParameter("memberEmail"));
		dto.setMemberId(request.getParameter("memberId"));
		dto.setMemberName(request.getParameter("memberName"));
		dto.setMemberNum(request.getParameter("memberNum"));
		dto.setMemberPhone1(request.getParameter("memberPhone1"));
		dto.setMemberPhone2(request.getParameter("memberPhone2"));
		dto.setMemberPost(request.getParameter("memberPost"));
		dto.setMemberPw(request.getParameter("memberPw"));
		
		String birth = request.getParameter("memberBirth"); // yyyy-mm-dd
		/// 자바에서 문자열을 날짜로 형변환
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
        Date date = null;
        try {
            date = sdf.parse(birth);
        } catch (Exception e) {
            e.printStackTrace();
        }
        dto.setMemberBirth(date);
        
        UserDAO dao = new UserDAO();
        dao.userJoin(dto);
	}
}
