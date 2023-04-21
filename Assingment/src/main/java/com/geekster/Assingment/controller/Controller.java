package com.geekster.Assingment.controller;

import com.geekster.Assingment.model.Student;
import com.geekster.Assingment.services.Service;
import jakarta.annotation.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1")

public class Controller {
    @Autowired
    private Service service;


   @GetMapping(value = "/getUser/{userid}")
    public List<Student> getUser( @PathVariable String userid){
        return service.getUser(userid);
    }
    @GetMapping(value = "/getAllUser")
    public List<Student> getAllUser(){
        return service.getAllUser();
    }

    @PostMapping(value = "/addUser")
    public String postData(@RequestBody Student student){
        return service.saveData(student);

    }
//
    @PutMapping(value = "/updateUserInfo")
    public String updateData(@RequestBody Student data , @RequestParam String id){
        return service.updateInfo(data,id);
    }

    @DeleteMapping(value = "/deletUser")

    public String deleteData(@RequestParam String id){
        return service.deleteData(id);
    }


}
