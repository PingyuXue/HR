package net.antra.deptemp.service;

import java.util.List;

import net.antra.deptemp.entity.Employee;
import net.antra.deptemp.pojo.EmployeeVO;

public interface EmployeeService {

	List<Employee> loadEmpBasicInfo();

	List<Employee> getAllEmpByDeptId(Integer id);

	Employee getEmpById(int i);

    void saveEmployee(EmployeeVO emp);
}
