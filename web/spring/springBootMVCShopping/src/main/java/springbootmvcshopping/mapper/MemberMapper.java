package springbootmvcshopping.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import springbootmvcshopping.domain.MemberDTO;
import springbootmvcshopping.domain.StartEndPageDTO;

@Mapper
public interface MemberMapper {
	public void memberInsert(MemberDTO dto);
	public List<MemberDTO> memberSelectList(StartEndPageDTO sepDTO);
	public int memberCount();
	public MemberDTO memberSelectOne(String memberNum);
}
