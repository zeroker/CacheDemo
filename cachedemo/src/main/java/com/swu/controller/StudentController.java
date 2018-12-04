package com.swu.controller;

import com.swu.domain.Student;
import com.swu.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/stu")
public class StudentController {

    @Autowired
    private IStudentService studentService;

    /**
     * 查询所有学生方法
     */
    @RequestMapping("/findAll")
    public String findAllStu() {
        List<Student> studentList = studentService.findAll();
        System.out.println(studentList);
        return "success";
    }
}
