package jspMVCMisoShopping.service.goods;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import jspMVCMisoShopping.model.dao.EmployeeDAO;
import jspMVCMisoShopping.model.dao.GoodsDAO;
import jspMVCMisoShopping.model.dto.AuthInfoDTO;
import jspMVCMisoShopping.model.dto.GoodsDTO;

public class GoodsWriteService {
	public void execute(HttpServletRequest request) {
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 이미지
		int fileSize = 1024 * 1024 * 100; // 파일크기설정
		String realPath = // 경로설정
				request.getServletContext().getRealPath("/goods/upload");
		System.out.println(realPath);

		try {
			MultipartRequest multi = new MultipartRequest(
					request, realPath, fileSize, "utf-8",
					new DefaultFileRenamePolicy());

			String goodsNum = multi.getParameter("goodsNum");
			String goodsName = multi.getParameter("goodsName");
			String goodPrice = multi.getParameter("goodsPrice");
			String goodsContent = multi.getParameter("goodsContent");
			
			// 파일 가져오기
			String storeMainImage = multi.getFilesystemName("mainImage");
			String MainImage = multi.getOriginalFileName("mainImage");
		
			String storeImage1 = multi.getFilesystemName("image1");
			String image1 = multi.getOriginalFileName("image1");
			String storeImage2 = multi.getFilesystemName("image2");
			String image2 = multi.getOriginalFileName("image2");
			String storeImage3 = multi.getFilesystemName("image3");
			String image3 = multi.getOriginalFileName("image3");
			
			String goodsDetailStoreImage = storeImage1 + "`" + storeImage2 + "`" + storeImage3;
			String goodsdetailImage = image1 + "`" + image2 + "`" + image3;
			
			// DB에 저장할 정보가 무엇인지를 분석해야 한다
			GoodsDTO dto = new GoodsDTO();
			dto.setGoodsNum(goodsNum);
			dto.setGoodsName(goodsName);
			dto.setGoodsPrice(Integer.parseInt(goodPrice));
			dto.setGoodsContent(goodsContent);

			HttpSession session = request.getSession();
			AuthInfoDTO auth = (AuthInfoDTO) session.getAttribute("auth");
			EmployeeDAO empDao = new EmployeeDAO();
			String empNum = empDao.empNumSelect(auth.getUserId());
			dto.setEmpNum(empNum); 
			
			dto.setGoodsMainImage(MainImage);
			dto.setGoodsMainStoreImage(storeMainImage);
			dto.setGoodsDetailImage(goodsdetailImage);
			dto.setGoodsDetailStoreImage(goodsDetailStoreImage);

			GoodsDAO dao = new GoodsDAO();
			dao.goodsInsert(dto);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
