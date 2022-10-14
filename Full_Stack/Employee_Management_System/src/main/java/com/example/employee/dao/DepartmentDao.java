package com.example.employee.dao;


import com.example.employee.pojo.Department;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class DepartmentDao {
    private static Map<Integer, Department> departments = null;
    static{
        departments = new HashMap<Integer,Department>();
        departments.put(1,new Department(1,"Department1"));
        departments.put(2,new Department(2,"Department2"));
        departments.put(3,new Department(3,"Department3"));
        departments.put(4,new Department(4,"Department4"));
        departments.put(5,new Department(5,"Department5"));

    }

    public Collection<Department> getDepartments(){
        return departments.values();
    }

    public Department getDepartmentById(Integer id){
        return departments.get(id);
    }
}
