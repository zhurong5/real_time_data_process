package jspMVCMisoShopping.model.dao;

import java.sql.Date;
import java.sql.SQLException;

import jspMVCMisoShopping.model.dto.AuthInfoDTO;
import jspMVCMisoShopping.model.dto.MemberDTO;

public class UserDAO extends DataBaseInfo{
	
	public void userJoin(MemberDTO dto) {
		con = getConnection();
		String memberNum = " select concat('mem_', nvl(substr(max(member_num),5),100000) + 1) from members ";
		sql = " insert into members ( member_num, member_name, member_id, ";
		sql+=					   " member_pw, member_addr, member_addr_detail, ";
		sql+=					   " member_post, member_regist, member_gender, ";
		sql+= 					   " member_phone1, member_phone2, member_email, ";
		sql+=					   " member_birth, member_point) ";
		sql+= " values(("+ memberNum +"),?,?,?,?,?,?, sysdate, ?,?,?,?,?,0) ";
		
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dto.getMemberName());
			pstmt.setString(2, dto.getMemberId());
			pstmt.setString(3, dto.getMemberPw());
			pstmt.setString(4, dto.getMemberAddr());
			pstmt.setString(5, dto.getMemberAddrDetail());
			pstmt.setString(6, dto.getMemberPost());
			pstmt.setString(7, dto.getGender());
			pstmt.setString(8, dto.getMemberPhone1());
			pstmt.setString(9, dto.getMemberPhone2());
			pstmt.setString(10, dto.getMemberEmail());
			pstmt.setDate(11, new Date(dto.getMemberBirth().getTime()));
			int i = pstmt.executeUpdate();
			System.out.println(i + "개 행이(가)생성되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();
		}
		
		
	}
	
	public AuthInfoDTO loginSelect(String userId) {
		AuthInfoDTO dto = null;
		con = getConnection();
		sql = " select member_id user_id, member_pw user_pw, "
				+ "        member_name user_name, member_Email user_email, 'mem' grade"
				+ " from members "
				+ " where member_id = ? "
				+ " union "
				+ " select emp_id, emp_pw , emp_name , emp_email , 'emp' "
				+ " from employees  "
				+ " where emp_id = ? ";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, userId);
			pstmt.setString(2, userId);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				dto = new AuthInfoDTO();
				dto.setGrade(rs.getString("grade"));
				dto.setUserEmail(rs.getString("user_Email"));
				dto.setUserId(rs.getString("user_id"));
				dto.setUserName(rs.getString("user_name"));
				dto.setUserPw(rs.getString("user_pw"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return dto;	
	
	}
	
	public void close() {
		if (rs != null)try {rs.close();} catch (Exception e) {}
		if (pstmt != null)try {pstmt.close();} catch (Exception e) {}
		if (con != null)try {con.close();} catch (Exception e) {}
	}

	

	
	
}
