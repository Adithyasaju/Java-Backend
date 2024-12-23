package com.pro.jdbc_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.jdbc.core.JdbcTemplate;



import java.util.List;
@Component
public class DatabaseDemo implements DemoI{
    @Autowired
    JdbcTemplate jt;


    @Override
    public void insertData() {
        jt.update("insert into employee values(101,'Rahul',45000);");

    }

    @Override
    public List getData() {
        return List.of();
    }
}
