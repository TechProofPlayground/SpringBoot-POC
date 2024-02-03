package com.techproof.student.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @GetMapping("/student")
    public String student() {
        return "student";
    }

    @GetMapping("/student/{id}")
    public String Student(@PathVariable String id)
    {
        return student();
    }

}
