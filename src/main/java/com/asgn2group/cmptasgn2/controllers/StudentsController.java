package com.asgn2group.cmptasgn2.controllers;

import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.asgn2group.cmptasgn2.models.Student;

@Controller // basically when we say @controllers and the import thing above. we are annotating it which mean we are basically saying this is a controller and listen for external requests 
public class StudentsController {
    @GetMapping("/users/view")
    public String getAllUsers(Model model){
        System.out.println("requesting to get all users");
        // TODO: gett all users from the database.
        List<Student> students = new ArrayList<>();
        students.add(new Student("mike",174.00,80.00,"Red",3.08));
        students.add(new Student("joe",170.00,90.00,"Brown",2.08));
        students.add(new Student("jack",190.00,110.00,"Gray",4.08));
        
        //end of database call
        model.addAttribute("us", students);//thus takes our users puts it in a model and sends it into the view to show everybody that is in this list
        return "users/showAll";
    }
}





// Code for database:

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




