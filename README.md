# itss3312project3, project documentation

Student Name: Zain Kalson
Class and Section: ITSS 3312, or 002

Example output:
      Welcome to Student and Course Management System!
      This system will allow you to manage students and courses. Let’s start with the number of
      students this system will have: 5
      ***Welcome to Student and Course Management System***
      Press ‘1’ for Student Management System (SMS)
      Press ‘2’ for Course Management System (CMS)
      Press ‘0’ to exit
      1
      ***Welcome to SMS***
      Press ‘1’ to add a student
      Press ‘2’ to deactivate a student
      Press ‘3’ to display all students
      Press ‘4’ to search for a student by ID
      Press ‘5’ to assign on-campus job
      Press ‘6’ to display all students with on-campus jobs
      Press ‘0’ to exit SMS
      1
      Enter first name: Joe
      Enter last name: Smith
      Enter level of the student: Freshman
      Joe Smith has been added as a Freshman with ID 7
      ***Welcome to SMS***
      Press ‘1’ to add a student
      Press ‘2’ to deactivate a student
      Press ‘3’ to display all students
      Press ‘4’ to search for a student by ID
      Press ‘5’ to assign on-campus job
      Press ‘6’ to display all students with on-campus jobs
      Press ‘0’ to exit SMS
      1
      1
      Enter first name: Mary
      Enter last name: Cane
      Enter level of the student: Junior
      Mary Cane has been added as a Junior with ID 6
      ***Welcome to SMS***
      Press ‘1’ to add a student
      Press ‘2’ to deactivate a student
      Press ‘3’ to display all students
      Press ‘4’ to search for a student by ID
      Press ‘5’ to assign on-campus job
      Press ‘6’ to display all students with on-campus jobs
      Press ‘0’ to exit SMS
      ***Welcome to SMS***
      Press ‘1’ to add a student
      Press ‘2’ to deactivate a student
      Press ‘3’ to display all students
      Press ‘4’ to search for a student by ID
      Press ‘5’ to assign on-campus job
      Press ‘6’ to display all students with on-campus jobs
      Press ‘0’ to exit SMS
      3
      Joe Smith
      ID: 7
      Level: Freshman
      Status: Active
      Mary Cane
      ID: 6
      Level: Junior
      Status: Active
      ***Welcome to SMS***
      Press ‘1’ to add a student
      Press ‘2’ to deactivate a student
      Press ‘3’ to display all students
      Press ‘4’ to search for a student by ID
      Press ‘5’ to assign on-campus job
      Press ‘6’ to display all students with on-campus jobs
      Press ‘0’ to exit SMS
      2
      2
      Enter the ID for the student you want to deactivate: 6
      Mary Cane has been deactivated
      ***Welcome to SMS***
      Press ‘1’ to add a student
      Press ‘2’ to deactivate a student
      Press ‘3’ to display all students
      Press ‘4’ to search for a student by ID
      Press ‘5’ to assign on-campus job
      Press ‘6’ to display all students with on-campus jobs
      Press ‘0’ to exit SMS
      4
      Enter the student ID: 7
      Joe Smith
      ID: 7
      Level: Freshman
      Status: Active
      ***Welcome to SMS***
      Press ‘1’ to add a student
      Press ‘2’ to deactivate a student
      Press ‘3’ to display all students
      Press ‘4’ to search for a student by ID
      Press ‘5’ to assign on-campus job
      Press ‘6’ to display all students with on-campus jobs
      Press ‘0’ to exit SMS
      5
      Enter student ID: 7
      Enter job: TA
      Enter job type: part-time
      Joe Smith has been assigned part-time TA job
      ***Welcome to SMS***
      Press ‘1’ to add a student
      Press ‘2’ to deactivate a student
      Press ‘3’ to display all students
      Press ‘4’ to search for a student by ID
      Press ‘5’ to assign on-campus job
      Press ‘6’ to display all students with on-campus jobs
      Press ‘0’ to exit SMS
      3
      6
      Joe Smith
      ID - 7
      Part-time TA
      ***Welcome to SMS***
      Press ‘1’ to add a student
      Press ‘2’ to deactivate a student
      Press ‘3’ to display all students
      Press ‘4’ to search for a student by ID
      Press ‘5’ to assign on-campus job
      Press ‘6’ to display all students with on-campus jobs
      Press ‘0’ to exit SMS
      0
      ***Welcome to Student and Course Management System***
      Press ‘1’ for Student Management System (SMS)
      Press ‘2’ for Course Management System (CMS)
      Press ‘0’ to exit
      2
      ***Welcome to CMS***
      Press ‘1’ to add a new course
      Press ‘2’ to assign student a new course
      Press ‘3’ to display student with assigned courses
      Press ‘0’ to exit CMS
      1
      Enter course ID: 3311
      Enter course name: Java 101
      Confirmation: New course 3311 has been added
      Press ‘1’ to add a new course
      Press ‘2’ to assign student a new course
      Press ‘3’ to display student with assigned courses
      Press ‘0’ to exit CMS
      2
      Enter student ID: 7
      Enter course ID: 3311
      Confirmation: Joe Smith has been assigned course 3311
      Press ‘1’ to add a new course
      Press ‘2’ to assign student a new course
      4
      Press ‘3’ to display student with assigned courses
      Press ‘0’ to exit CMS
      3
      Joe Smith
      ID – 7
      Courses: 3311
      Press ‘1’ to add a new course
      Press ‘2’ to assign student a new course
      Press ‘3’ to display student with assigned courses
      Press ‘0’ to exit CMS
      0
      ***Welcome to Student and Course Management System***
      Press ‘1’ for Student Management System (SMS)
      Press ‘2’ for Course Management System (CMS)
      Press ‘0’ to exit
      0
      Good Bye!!!
      

Research and Analysis (20 pts).
      The interfaces specifies the method headers for the Student and Course classes. While not
      required, doing this allows for more granular control over the types of methods in those classes.
      This program also uses inheritance, where the Student_Employee class inherits (extends) the
      Student class. This allows for Student_Employee to have all of the methods of Student without re-
      implementing it.
      Within the Student, Course, and Student_Employee class, getters and setters are used to indirectly
      access the otherwise private variables. This is a best practice to ensure encapsulation while also
      providing the main method with the data it needs.


Design (20 pts).
      There are 3 “forks” in the program, one for the Student Management System, one for the Course
      Management System, and one for exiting the system. These are implemented with do-while loops,
      which allow the user to go through all the functionality at least once and multiple times if they
      desire. Each fork in the program has its own subfunctionalities, which are implemented through a
      dedicated while loop for each fork.


Testing (10 pts).
      The first iteration of testing involved ensuring the frontend was working correctly. This
      phase ensured that the user was receiving prompts and that inputs were being properly
      recorded. For this, I simply used a print statement to print the variable that holds the user
      input. After testing the front end, I made sure the Student class had everything set up
      correctly.To do this, I created Student objects and printed them, making sure the correct
      fields existed and that the Constructor was working properly. I also individually tested each
      getter and setter by having the result be printed out. From there, I started putting student
      objects into an array and printing each element of the array. The final phase of testing was
      the most time intensive and involved ensuring there were no logical errors and the correct
      outputs were produced. For the operation that entailed creating a user, I printed a sample
      array of students and iterated through it to make sure users were being correctly made.
      For the operation to deactivate the student, I got verbose output from both the Student and
      main class to make sure the variable was correctly being set to false. I also tested that the
      if statement was correctly matching the ID with the database. For the operation to iterate
      through the array, I made sure that Arrays.sort() was correctly ordering the output
      alphabetically and was not missing any elements. I also had to confirm that the String
      array I created successfully copied the information from the database array. For the last
      operation, I made sure that students were being correctly returned based on the ID.I also
      did some very basic error detection. If a user inputs an invalid integer (anything outside of
      0-4), the program will let the user know that that number is not supported. This could be
      further improved by adding a try catch to handle doubles or other data types being
      entered. To further correct this program, I could have added a system to check if an ID
      already exists. That way, ID search logical errors could be prevented.
