package com.geekster.Assingment.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Student {

   private   String UserId ;
    private   String Name;
    private  String UserName;
    private  String Address;
    private  String Phone_Number;



}
