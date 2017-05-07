package com.example.dsquare.studentinfo;

import java.io.Serializable;

/**
 * Created by DSQUARE on 5/3/2017.
 */

public class Student  {

    String name;
    String faculty;
    String address;

    public Student(String name, String faculty, String address) {
        this.name = name;
        this.faculty = faculty;
        this.address = address;
    }

    public  String getName() {
        return name;
    }



    public String getFaculty()
    {
        return faculty;
    }



    public String getAddress()
    {
        return address;
    }


}
