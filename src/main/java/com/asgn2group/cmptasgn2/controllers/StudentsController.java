package com.asgn2group.cmptasgn2.controllers;

import java.util.List;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestParam;

import com.asgn2group.cmptasgn2.models.Student;
import com.asgn2group.cmptasgn2.models.StudentRepository;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;



@Controller // VIEW ALL : basically when we say @controllers and the import thing above. we are annotating it which mean we are basically saying this is a controller and listen for external requests 
public class StudentsController {
    @Autowired
    private StudentRepository studentRepo;
    //view all students
    
    //view all students
    @GetMapping("/users/adding")
    public String showStudentForm(Model model) {
    
        System.out.println("requesting to get all users");
        // getting all users/students from the database.
        List<Student> students = studentRepo.findAll();
        
        //end of database call
        model.addAttribute("us", students);//
        return "users/studentadd";

    }
    //postmapping for the add new student form. then refreshes to load in the new student
    @PostMapping("/users/adding")
    public String addStudent(@RequestParam Map<String, String> newstudent, HttpServletResponse response){
        //giving insight to what is happening:
        System.out.println("Adding new student");
        //adding values of the new student from to form to the database:
        String newName = newstudent.get("name");
        Float newHeight = Float.parseFloat( newstudent.get("height"));
        Float newWeight = Float.parseFloat( newstudent.get("weight"));
        String newHaircolor = newstudent.get("haircolor");
        Float newGpa = Float.parseFloat( newstudent.get("gpa"));
        studentRepo.save(new Student(newName,newHeight,newWeight,newHaircolor,newGpa));
        response.setStatus(201);
        //redirecting the page so it laods back to itself. this allows the getmapping of the same page to update show the students
        String url = "redirect:/users/adding";
        return url;
    }

    // UPDATE:
    @GetMapping("/students/{id}") 
    public String getSelectStudent(@PathVariable("id") Long id, Model model){

        
        return "users/update.html";

    }

}


    // DELETE:







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




