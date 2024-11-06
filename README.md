[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/kC5Q863S)


### Lab: Student Record Management

**Objective:**  
To practice working with constructors, parameterized constructors, getters, setters, and arrays by creating a simple system to manage student records.


### Scenario

You are tasked with creating a Java class `Student` that represents a student’s record. Each student has a name, ID, and an array of grades for several subjects. Then, you'll create a `StudentManagement` class to manage multiple `Student` objects and perform some basic operations on them.

---

### Part 1: Student Class

1. **Define the Attributes:**
   - Private attributes for `String name`, `int id`, and an `int[] grades` array (to store grades for different subjects).
   
2. **Constructors:**
   - A **default constructor** that initializes the `name` as `"Unknown"`, `id` as `0`, and `grades` as an empty array.
   - A **parameterized constructor** that takes a `name`, `id`, and an array of `grades` as parameters and initializes them accordingly.
   
3. **Getters and Setters:**
   - Create getters and setters for each attribute (`name`, `id`, and `grades`).
   - In the setter for `grades`, include validation to ensure all grades are between `0` and `100`. If any grade is out of this range, print an error message and ignore that grade.

4. **Method to Calculate Average Grade:**
   - Write a method `calculateAverage()` that calculates and returns the average of the grades in the `grades` array.
   - If the `grades` array is empty, return `0` as the average.

---

### Part 2: StudentManagement Class

1. **Array of Students:**
   - Create a `Student[] students` array to store multiple `Student` objects (up to 5 students for simplicity).

2. **Add Students:**
   - Write a method `addStudent(Student student)` that adds a `Student` to the `students` array.
   - Ensure you don’t exceed the array limit. If the array is full, print a message indicating that no more students can be added.

3. **Display All Students:**
   - Write a method `displayAllStudents()` that iterates over the `students` array and displays each student’s details (`name`, `id`, and average grade).


---

### Sample Program Flow

```plaintext
Creating students...

Adding Student: Name=Alice, ID=101, Grades={85, 90, 78}
Adding Student: Name=Bob, ID=102, Grades={92, 87, 75, 80}

Displaying All Students:
Name: Alice, ID: 101, Average Grade: 84.33
Name: Bob, ID: 102, Average Grade: 83.5

Searching for Student with ID 101:
Name: Alice, ID: 101, Grades: 85, 90, 78, Average Grade: 84.33


---

### Code Structure

- **Class `Student`**
  - Attributes: `name`, `id`, `grades`
  - Constructors: Default and parameterized
  - Getters and setters
  - `calculateAverage()` method

- **Class `StudentManagement`**
  - Attribute: `students` (array)
  - Methods: `addStudent(Student student)`, `displayAllStudents()`, 
