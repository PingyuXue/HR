package net.antra.deptemp.dao;

import net.antra.deptemp.entity.Employee;

public interface EmployeeCustomDAO {
    void save(Employee emp, Integer id);
}
