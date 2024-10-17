package springbootmvcshopping.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import springbootmvcshopping.domain.EmployeeDTO;
import springbootmvcshopping.domain.StartEndPageDTO;

@Mapper
public interface EmployeeMapper {
	public void employeeInsert(EmployeeDTO dto);
	public List<EmployeeDTO> employeeSelectList(StartEndPageDTO sepDTO);
	public int employeeCount();
	public EmployeeDTO employeeSelectOne(String empNum);
	public void employeeUpdate(EmployeeDTO dto);
	public void employeeDelete(String empNum);
}
