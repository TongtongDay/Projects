package com.example.employee.dao;

import com.example.employee.pojo.Department;
import com.example.employee.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class EmployeeDao {

    private static Map<Integer,Employee> employees = null;

    @Autowired
    private DepartmentDao departmentDao;

    static{
        employees = new HashMap<Integer,Employee>();
        employees.put(1,new Employee(1,"AA","12@gmail.com",0,new Department(1,"Department1")));
        employees.put(2,new Employee(2,"BB","34@gmail.com",1,new Department(2,"Department2")));
        employees.put(3,new Employee(3,"CC","56@gmail.com",0,new Department(3,"DEpartment3")));
        employees.put(4,new Employee(4,"DD","78@gmail.com",1,new Department(4,"Department4")));
        employees.put(5,new Employee(5,"EE","09@gamil.com",0,new Department(5,"Department5")));
    }

    private static Integer initId = 6;

    public  void save(Employee employee){
        if(employee.getId() == null){
            employee.setId((initId++));
        }

        employee.setDepartment(departmentDao.getDepartmentById(employee.getDepartment().getId()));

        employees.put(employee.getId(),employee);
    }

    public Collection<Employee> getAll(){
        return employees.values();
    }

    public Employee getEmployeeById(Integer id){
        return employees.get(id);
    }

    public void delete(Integer id){
        employees.remove(id);
    }

}
