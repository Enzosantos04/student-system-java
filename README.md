# Student Registration System

This is a simple Java program that allows users to register students by entering their names, emails, and grades. The program then calculates and displays the students' average grades.

## Features

- Register students with their name, email, and two grades.
- Automatically calculates the average grade for each student.
- Displays a list of registered students with their details.
- Uses an `ArrayList` to store student data dynamically.

## Example Input/Output

**Input:**
```
Student Registration System
Student name: John Doe
Student email: john.doe@example.com
Grade 1: 85
Grade 2: 90
Do you want to add another student? (yes/no): no
```

**Output:**
```
Student List
---------------
Student details:
Name: John Doe
Email: john.doe@example.com
Grade 1: 85.0
Grade 2: 90.0
Grades Average: 87.5
---------------
```

## Code Structure

- `Main.java`: Handles user input, creates `Students` objects, and displays student details.
- `Students.java`: Defines the `Students` class with attributes and methods to store and retrieve student data.



