package com.geekster.Assingment.repository;

import com.geekster.Assingment.model.Student;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Repository

public class Repository {

    public ArrayList<Student> allUser = new ArrayList<>();
    ;

    public Repository() {
//       allUser = new ArrayList<>();
        allUser.add(new Student("1", "manish", "manu", "Adress", "7875086330"));
    }


    public List<Student> getAllUser() {
        return allUser;
    }


    public boolean save(Student data) {

        allUser.add(data);
        return true;
    }

    public String updateInfo(Student data, String id) {

        if (id == null) {
            return "Plese...!! enter a id";
        } else {

            for (Student val : allUser) {
                if (val.getUserId().equals(id)) {
                    val.setUserId(data.getUserId());
                    val.setName(data.getName());
                    val.setAddress(data.getAddress());
                    val.setUserName(data.getUserName());
                    return "Successfully Updated";
                }

            }
            return "Plese...!! enter a id";
        }

    }

    public String deletUser(String id) {
        if (id == null) {
            return "please enter a valid id.....!!!!!";
        } else {


            for (Student val : allUser) {
                if (val.getUserId().equals(id)) {
                    allUser.remove(val);
                    return "successfully deleted Id...";
                }

            }
        }
        return null;


    }
}
