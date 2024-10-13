package jspMVCMisoShopping.model.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jspMVCMisoShopping.model.dto.ReviewDTO;

public class ReviewDAO extends DataBaseInfo{
	
	public List<ReviewDTO> reviewSelectAll(String goodsNum) {
		List<ReviewDTO> list = new ArrayList<ReviewDTO>();
		con = getConnection();
		sql = " select REVIEW_NUM, REVIEW_CONTENTS, REVIEW_DATE, MEMBER_ID ";
		sql+= " from reviews ";
		sql+= " where goods_num = ? ";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, goodsNum);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				ReviewDTO dto = new ReviewDTO();
				dto.setReviewNum(rs.getInt("REVIEW_NUM"));
				dto.setReviewContent(rs.getString("REVIEW_CONTENTS"));
				dto.setMemberId(rs.getString("MEMBER_ID"));
				dto.setReviewDate(rs.getDate("REVIEW_DATE"));
				list.add(dto);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}
		return list;
	}
	
	public void reviewDelete(String reviewNum) {
		con = getConnection();
		sql = " delete from reviews where review_num = ? ";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, reviewNum);
			int i = pstmt.executeUpdate();
			System.out.println(i + "개가 삭제되었습니다.");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}
		
	}
	
	public void reviewSelectOne(ReviewDTO dto) {
		con = getConnection();
		sql = " select REVIEW_CONTENTS from reviews ";
		sql+= " where PURCHASE_NUM = ? and GOODS_NUM = ? ";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dto.getPurchaseNum());
			pstmt.setString(2, dto.getGoodsNum());
			rs = pstmt.executeQuery();
			if (rs.next()) {
				dto.setReviewContent(rs.getString("REVIEW_CONTENTS"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}
		
	}
	
	public void reviewInsert(ReviewDTO dto) {
		con = getConnection();
		sql = " merge into reviews r ";
		sql+= " using ( select purchase_num, goods_num from purchase_list ";
		sql+= " 		where PURCHASE_NUM = ? and GOODS_NUM = ?) p ";
		sql+= " on (r.PURCHASE_NUM = p.PURCHASE_NUM and r.GOODS_NUM = p.GOODS_NUM) ";
		sql+= " when matched then ";
		sql+= " 	update set REVIEW_CONTENTS = ? ";
		sql+= " when not matched then ";
		sql+= " insert (review_num, GOODS_NUM, PURCHASE_NUM, REVIEW_DATE, REVIEW_CONTENTS, MEMBER_ID ) ";
		sql+= " values (review_seq.nextval, p.GOODS_NUM, p.PURCHASE_NUM, sysdate, ?, ?) ";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dto.getPurchaseNum());
			pstmt.setString(2, dto.getGoodsNum());
			pstmt.setString(3, dto.getReviewContent());
			pstmt.setString(4, dto.getReviewContent());
			pstmt.setString(5, dto.getMemberId());
			int i = pstmt.executeUpdate();
			System.out.println(i + "개행이 삽입되었다");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}
		
	}
}
