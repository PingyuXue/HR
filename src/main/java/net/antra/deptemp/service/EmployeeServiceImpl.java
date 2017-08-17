package net.antra.deptemp.service;

import java.util.List;

import net.antra.deptemp.dao.EmployeeCustomDAO;
import net.antra.deptemp.pojo.EmployeeVO;
import net.antra.deptemp.utility.DomainVOConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.antra.deptemp.dao.EmployeeDAO;
import net.antra.deptemp.entity.Employee;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDAO empDAO;

	@Autowired
	EmployeeCustomDAO empCustomDAO;

	@Override
	public List<Employee> loadEmpBasicInfo() {
		return empDAO.getEmployeeList();
	}

	@Override
	public List<Employee> getAllEmpByDeptId(Integer id) {
		return empDAO.getAllEmpByDeptId(id);
	}

	@Override
	public Employee getEmpById(int id) {
		return empDAO.findOne(id);
	}

	@Override
	@Transactional
	public void saveEmployee(EmployeeVO empVO) {

		Employee emp = DomainVOConverter.convertEmpVOtoEmp(empVO);
		empCustomDAO.save(emp, empVO.getDeptId());
	}

}
