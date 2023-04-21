package com.geekster.Assingment.services;

import com.geekster.Assingment.model.Student;
import com.geekster.Assingment.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Service

public class Service {

     @Autowired
     private  Repository repository;
    public List<Student> getAllUser() {

           return repository.getAllUser();

        }

        public List<Student> getUser(String id) {
            List<Student> list1 = new ArrayList<>();


                List<Student> list = repository.getAllUser();

                for (Student val : list) {

                    if (val.getUserId().equals(id)) {
                        list1.add(val);
                    }

            }
                return list1;

        }


    public String saveData(Student data) {
       boolean insetion = repository.save(data);

       if(insetion== true){
           return "Added Successfully";
       }else return "Failed....!!!!";


    }
//
    public String updateInfo(Student data, String id) {

       return repository.updateInfo(data,id);


    }

    public String deleteData(String id) {

        return repository.deletUser(id);


    }
}
