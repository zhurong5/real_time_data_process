package springbootmvcshopping.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import springbootmvcshopping.domain.EmployeeDTO;

@Mapper
public interface EmployeeInfoMapper {
	public EmployeeDTO employeeSelectOne(String empId);
	public Integer employeeUpdate(EmployeeDTO dto);
	public Integer employeePwUpdate(@Param("_newPw") String empPwString
									, @Param("newPw_") String empId);
}
