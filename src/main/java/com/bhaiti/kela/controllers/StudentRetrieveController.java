package com.bhaiti.kela.controllers;

import java.util.List;

import com.bhait.beans.Student;
import com.bhait.beans.StudentRegistration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
public class StudentRetrieveController {

    @GetMapping("/student/allstudent")

    @ResponseBody
    public List<Student> getAllStudents() {
        return StudentRegistration.getInstance().getStudentRecords();
    }
}

