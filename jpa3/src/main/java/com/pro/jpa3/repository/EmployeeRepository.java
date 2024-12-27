package com.pro.jpa3.repository;

import com.pro.jpa3.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
  //select * from emp_tab where employee_name like 'R%;
    public abstract List<Employee> findByEmpNameLike(String str);

    //select * from emp_tab where salary >=70000
    public abstract List<Employee> findByEmpSalGreaterThanEqual(Double sal);

    //select * from emp_tab where employee_name like '%a' and salary >=60000;
    public abstract List<Employee> findByEmpNameLikeAndEmpSalGreaterThan(String str,Double sal);


}
