package springbootmvcshopping.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import springbootmvcshopping.domain.MemberDTO;

@Mapper
public interface MemberMapper {
	public void memberInsert(MemberDTO dto);
	public List<MemberDTO> memberSelectList(String searchWord);
}
