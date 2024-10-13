package jspMVCMisoShopping.model.dao;

import java.sql.SQLException;

public class FindDAO extends DataBaseInfo {
	
	public String findId(String userName, String userEmail) {
		String userId = null;
		con = getConnection();
		sql = " select member_id ";
		sql+= " from members ";
		sql+= " where member_name = ? and member_email= ? ";
		sql+= " union ";
		sql+= " select emp_id ";
		sql+= " from employees ";
		sql+= " where emp_name = ? and emp_email = ? ";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, userName);
			pstmt.setString(2, userEmail);
			pstmt.setString(3, userName);
			pstmt.setString(4, userEmail);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				userId = rs.getString("member_id");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return userId;
		
	}
	
	public String userSerch(String userId, String userPhone) {
		String i = null;
		con = getConnection();
		sql = " select 'mem' from members "
				+ " where member_id = ? and "
				+ " (member_phone1 = ? or member_phone2 = ? ) "
				+ " union "
				+ " select 'emp' from employees "
				+ " where emp_id = ? and emp_phone = ? ";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, userId);
			pstmt.setString(2, userPhone);
			pstmt.setString(3, userPhone);
			pstmt.setString(4, userId);
			pstmt.setString(5, userPhone);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				i = rs.getString(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}
		return i;
		
	}
	
	public void userPwUpdate(String userId,String newPw,String grade) {
		con = getConnection();
		switch (grade) {
		case "mem": sql = " update members "
						+ " set member_pw = ? "
						+ " where member_id = ? ";
			break;
		case "emp": sql = " update employees "
						+ " set emp_pw = ? "
						+ " where emp_id = ? ";
			break;
		}
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, newPw);
			pstmt.setString(2, userId);
			int i = pstmt.executeUpdate();
			System.out.println("비밀번호가 변경되었습니다");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}
	}
		
		
	
	
	public void close() {
		if (rs != null)try {rs.close();} catch (Exception e) {}
		if (pstmt != null)try {pstmt.close();} catch (Exception e) {}
		if (con != null)try {con.close();} catch (Exception e) {}
	}
	
}
