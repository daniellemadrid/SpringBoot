package com.bhaiti.kela.controllers;

import com.bhait.beans.Student;
import com.bhait.beans.StudentRegistration;
import com.bhait.beans.StudentRegistrationReply;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class StudentRegistrationController {

    @PostMapping("/register/student")
    @ResponseBody
    public StudentRegistrationReply registerStudent(@RequestBody Student student) {
        System.out.println("In registerStudent");
        StudentRegistrationReply stdregreply = new StudentRegistrationReply();
        StudentRegistration.getInstance().add(student);
        //We are setting the below value just to reply a message back to the caller
        stdregreply.setName(student.getName());
        stdregreply.setAge(student.getAge());
        stdregreply.setRegistrationNumber(student.getRegistrationNumber());
        stdregreply.setRegistrationStatus("Successful");

        return stdregreply;
    }

}
