package springbootmvcshopping.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import springbootmvcshopping.domain.EmployeeDTO;

@Mapper
public interface EmployeeMapper {
	public void employeeInsert(EmployeeDTO dto);
	public List<EmployeeDTO> employeeSelectList();
	public EmployeeDTO employeeSelectOne(String empNum);
	public void employeeUpdate(EmployeeDTO dto);
	public void employeeDelete(String empNum);
}
