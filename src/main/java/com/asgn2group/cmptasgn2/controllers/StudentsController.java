package com.asgn2group.cmptasgn2.controllers;

import java.util.List;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestParam;

import com.asgn2group.cmptasgn2.models.Student;
import com.asgn2group.cmptasgn2.models.StudentRepository;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;



@Controller // basically when we say @controllers and the import thing above. we are annotating it which mean we are basically saying this is a controller and listen for external requests 
public class StudentsController {
    @Autowired
    private StudentRepository studentRepo;

    @GetMapping("/users/view")
    public String getAllUsers(Model model){
        System.out.println("requesting to get all users");
        // getting all users/students from the database.
        List<Student> students = studentRepo.findAll();
        
        //end of database call
        model.addAttribute("us", students);//thus takes our users puts it in a model and sends it into the view to show everybody that is in this list
        return "users/showAll";
    }

    @PostMapping("/users/add")
    public String addStudent(@RequestParam Map<String, String> newstudent, HttpServletResponse response){
        System.out.println("Adding new student");
        String newName = newstudent.get("name");
        double newHeight = Double.parseDouble( newstudent.get("height"));
        double newWeight = Double.parseDouble( newstudent.get("weight"));
        String newHaircolor = newstudent.get("haircolor");
        float newGpa = Float.parseFloat( newstudent.get("gpa"));
        studentRepo.save(new Student(newName,newHeight,newWeight,newHaircolor,newGpa));
        response.setStatus(201);
        return "users/addedStudent";
    }

}





// while uneeded this is the Code for database minipulation through the command line:

// - to create the database 
//     - CREATE TABLE students (uid SERIAL, name VARCHAR(255), height Float, weight FLOAT, haircolor VARCHAR(255), gpa FLOAT);

// - to add to the database:
//     - INSERT INTO students (name,height,weight,haircolor,gpa) VALUES ('michael',174,80,'brown',3.08);

// - to read from the database. 
//     - SELECT name,height,weight,haircolor,gpa FROM "students";


// - to update
//     - UPDATE students SET haircolor='lightbrown' WHERE uid= 1;

// - to delete.
//     - DELETE FROM students WHERE uid=1;

// - to drop table.
//     - DROP TABLE students;




