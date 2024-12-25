package com.pro.jpa2.runner;

import com.pro.jpa2.model.Employee;
import com.pro.jpa2.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class MyRunner implements CommandLineRunner {

    @Autowired
    EmployeeRepository emp_Repo;

    @Override
    public void run(String... args) throws Exception {
        /*
        emp_Repo.save(new Employee("Rahul",45000.45));
        emp_Repo.save(new Employee("Soan",55000.55));
        emp_Repo.save(new Employee("Priya",65000.65));
        */
        //fetch employee record bt Id;
        /*
        Optional<Employee> obj=emp_Repo.findById(1);
        if(obj.isPresent()){
            System.out.println(obj.get());
        }
        else{
            System.out.println("Employee Not Exist");
        }
         */
        //fetch all employee records using findAll() method
//        emp_Repo.findAll().forEach(employee -> {
//            System.out.println(employee);
//        });
        //or emp_Repo.findAll().forEach(System.out::println);

        //delete employee by Id
        emp_Repo.deleteAllInBatch();
    }
}
