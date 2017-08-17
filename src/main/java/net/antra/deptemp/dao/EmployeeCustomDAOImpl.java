package net.antra.deptemp.dao;

import net.antra.deptemp.entity.Department;
import net.antra.deptemp.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Repository
public class EmployeeCustomDAOImpl implements EmployeeCustomDAO{

    @PersistenceContext
    EntityManager em;

    @Override
    public void save(Employee emp, Integer id) {
        Query query = em.createQuery("Select d from Department d where d.id =:id");
        query.setParameter("id", id);
        Department dept = (Department) query.getSingleResult();
        emp.setDepartment(dept);
        em.persist(emp);
    }
}
