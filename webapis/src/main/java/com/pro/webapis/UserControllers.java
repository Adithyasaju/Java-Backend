package com.pro.webapis;


import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController


public class UserControllers {

    //API URL:localhost:8082/
    @GetMapping("/")
    public  String getDetails(){
        return "Getting Details";
    }


    //API URL:localhost:8082/read
    @GetMapping("/read")
    public Map<String,String> empDetails(){
        HashMap<String,String> map =new HashMap<>();
        map.put("eid","101");
        map.put("ename","Rahul");
        map.put("esal","45000");
        return  map;
    }
 
    //API URL:localhost:8082/create
    //Method:POST
    @PostMapping("/create")
    public Map <String,String> create_User(){
        Map <String,String> map=new HashMap<>();
        map.put("msg","New User Created");
        return  map;
    }

    //API URL:localhost:8082/update
    //Method:PUT
    @PutMapping("/update")
    public boolean updateUser(){
        return  true;
    }

    //API URL:localhost:8082/del
    //Method:DELETE
    @DeleteMapping("/del")
    public  String delUser(){
        return  "User Deleted";
    }
}
