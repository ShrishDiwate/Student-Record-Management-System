# Student Record Management System

A console-based Java application for managing student records. This system allows you to perform basic CRUD (Create, Read, Update, Delete) operations on student data.

## Features

- **Add Student**: Register new students with ID, name, and marks
- **Update Student**: Modify existing student information
- **View Students**: Display all registered students
- **Remove Student**: Delete student records by ID
- **User-friendly Menu**: Interactive console interface

## Technologies Used

- Java 8+
- ArrayList for data storage
- Scanner for user input

## Project Structure

```
src/
└── com/elevateLabs/
    ├── Student.java                      # Student model class
    └── StudentRecordManagementSystem.java # Main application class
```

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- Any Java IDE (Eclipse, IntelliJ IDEA, VS Code) or command line

### Installation

1. Clone the repository:
```bash
git clone https://github.com/yourusername/student-record-management-system.git
```

2. Navigate to the project directory:
```bash
cd student-record-management-system
```

3. Compile the Java files:
```bash
javac src/com/elevateLabs/*.java
```

4. Run the application:
```bash
java -cp src com.elevateLabs.StudentRecordManagementSystem
```

## Usage

When you run the application, you'll see a menu with the following options:

```
**** Student Management System ****
1. Add student
2. Update student
3. View student
4. Remove student
5. Exit
***********************************
```

### Adding a Student
- Select option 1
- Enter student ID (integer)
- Enter student name (string)
- Enter student marks (double)

### Updating a Student
- Select option 2
- Enter the ID of the student to update
- Provide new name and marks

### Viewing Students
- Select option 3
- All student records will be displayed

### Removing a Student
- Select option 4
- Enter the ID of the student to delete

### Exit
- Select option 5 to exit the application

## Example Output

```
**** Student Management System ****
1. Add student
2. Update student
3. View student
4. Remove student
5. Exit 
***********************************
Enter the choice: 1
Enter the Id of student: 101
Enter the name of the student: John Doe
Enter the total marks of the student: 85.5
Student added successfully!

Student records: 
Student [id=101, name=John Doe, marks=85.5]
```

## Class Overview

### Student.java
- **Attributes**: `id`, `name`, `marks`
- **Constructor**: Initializes student with provided values
- **Methods**: Getters, setters, and `toString()` for display
- **Encapsulation**: Private fields with public accessor methods

### StudentRecordManagementSystem.java
- **Main Class**: Contains the application logic
- **Static Methods**: 
  - `addStudent()`: Adds new student to the list
  - `updateStudent()`: Updates existing student information
  - `viewStudent()`: Displays all students
  - `removeStudent()`: Removes student by ID
- **Data Storage**: Uses `ArrayList<Student>` for in-memory storage

## Limitations

- Data is stored in memory only (not persistent)
- No data validation for duplicate IDs
- Console-based interface only
- No file I/O operations

## Future Enhancements

- [ ] Add file-based persistence (JSON/CSV)
- [ ] Implement data validation
- [ ] Add search functionality
- [ ] Create GUI interface
- [ ] Add sorting and filtering options
- [ ] Implement database connectivity
- [ ] Add grade calculation features

## Acknowledgments

- Thanks to Elevate Labs for the project structure
- Built as a learning exercise for Java fundamentals

---
