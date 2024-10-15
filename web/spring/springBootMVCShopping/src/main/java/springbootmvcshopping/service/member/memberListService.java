package springbootmvcshopping.service.member;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import springbootmvcshopping.domain.MemberDTO;
import springbootmvcshopping.mapper.MemberMapper;

@Service
public class memberListService {
	@Autowired
	MemberMapper memberMapper;
	public void execute(String searchWord, Model model) {
		List<MemberDTO> list = memberMapper.memberSelectList(searchWord);
		model.addAttribute("list", list);
		model.addAttribute("searchWord", searchWord);
	}
}
