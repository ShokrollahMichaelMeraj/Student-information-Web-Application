# cmpt-276-assignment-2
-
Description:

- website which is about students is connected to a student database.
- the user can add new students and have an interactive part which shows the stduents. 
- the user can update student information.
- user can also dlete the suer information. 



Database requirements:

- create a database with the following attributes:
    - name
    - weight
    - height
    - haircolor
    - gpa



Application: Your Spring app should have the following features (I would suggest making a separate endpoint for each):

Webapplication features and workflow:

- landing page:
    - upon loading the link you will be met with a landing page
    - there will be a navigation bar with the appropriate links 
    - there will also be a quick information introductuion to the webpage and its capabilities. 
    
- add a student
    - load up website
    - go to student page
    - you will be able to see the students on the left of the page, 
    - on the right of the page there will be a box for adding students.
        - there will be multiple inputs and infomration that is needed.
        - the page will ask for:
            - name
            - weight
            - height
            - haircolor
            - gpa
        - and will only accept if the correct information has been inputed.
            - this will involve error checking for the foloowing situations:
                - is an input which needs to be a number is a number (wieght, height, and gpa)
                - is an input which needs to be a string is a string (name, haircolor)
    
- update or delete
    - clicking on the students (rectangles representing the students will take us to another page which allows us to update or delete that student.)
    - when going to that page that students current information will be shown. 
    - the page will show :
        - id (the only information which will not be changable.)
        - name
        - weight
        - height
        - haircolor
        - gpa

    - updating:
        - the user sees the selected students current data 
        - the user is also able to change these values 
            - and hit the update button which will change the information in the database 
            - and change the rectangle the represent the student.

    - deleting:
        - in the update page there should be a delete button which corralates with the selected student
        - pressing the delete button will delete the current selected student from the database 
        - and the user will be given a promtp saying: "student "student name" has been succesfully deleted"

    

UI-Mockup:

