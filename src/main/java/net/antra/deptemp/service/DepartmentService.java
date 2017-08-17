package net.antra.deptemp.service;

import java.util.List;

import net.antra.deptemp.entity.Department;
import net.antra.deptemp.pojo.DepartmentVO;

public interface DepartmentService {
	void saveDept(DepartmentVO dept);

	List<Department> loadDeptDetails();

	List<Department> loadDeptBasicInfo();

	void deleteDeptById(Integer id);

	Department getDeptById(Integer id);
}
