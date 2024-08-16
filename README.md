Student-information-Web-Application
-
Description:

- The student information website is connected to a student database.
- The user can add new students and have an interactive part that shows the students. 
- The user can update student information.
- Users can also delete the user information. 



Database requirements:

- create a database with the following attributes:
    - name
    - weight
    - height
    - hair colour
    - GPA



Application: Your Spring app should have the following features (I would suggest making a separate endpoint for each):

Application features and workflow:

- landing page:
    - upon loading the link, you will be met with a landing page
    - there will be a navigation bar with the appropriate links 
    - there will also be a quick information introduction to the webpage and its capabilities. 
    
- add a student
    - load up website
    - go to the student page
    - you will be able to see the students on the left of the page, 
    - on the right of the page, there will be a box for adding students.
        - there will be multiple inputs and information that are needed.
        - the page will ask for:
            - name
            - weight
            - height
            - hair colour
            - GPA
        - and will only accept if the correct information has been inputted.
            - this will involve error checking for the following situations:
                - is an input which needs to be a number is a number (weight, height, and GPA)
                - is an input which needs to be a string is a string (name, hair colour)
    
- update or delete
    - Clicking on the students (rectangles representing the students will take us to another page, which will allow us to update or delete that student)
    - when going to that page, that student's current information will be shown. 
    - the page will show :
        - id (the only information that will not be changeable)
        - name
        - weight
        - height
        - hair colour
        - GPA

    - updating:
        - the user sees the selected students' current data 
        - the user is also able to change these values 
            - and hit the update button, which will change the information in the database 
            - and change the rectangle the represent the student.

    - deleting:
        - in the update page, there should be a delete button which correlates with the selected student
        - pressing the delete button will delete the current selected student from the database 
        - and the user will be given a prompt saying: "student "student name" has been successfully deleted"

    

UI-Mockup:

