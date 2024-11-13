public class Main {

    public static void main(String[] args) {
        StudentManagement sm = new StudentManagement();

        Student s1 = new Student("Messi", 1, new int[]{100, 95, 100});
        Student s2 = new Student("Hazard", 2, new int[]{95, 100, 95, 95});
        Student s3 = new Student("Neymar", 3, new int[]{95, 100, 92});

        sm.addStudent(s1);
        sm.addStudent(s2);
        sm.addStudent(s3);

        sm.displayAllStudents();
    }
}

class Student {
    private String name;
    private int id;
    private int[] grades;
    
    public Student() {
        this.name = "Unknown";
        this.id = 0;
        this.grades = new int[0];
    }

    public Student(String name, int id, int[] grades) {
        this.name = name;
        this.id = id;
        setGrades(grades); 
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        for (int grade : grades) {
            if (grade < 0 || grade > 100) {
                System.out.println("Invalid grade: " + grade + ". Grades must be between 0 and 100.");
                return;
            }
        }
        this.grades = grades;
    }

    public double calculateAverage() {
        if (grades.length == 0) {
            return 0;
        }
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
    }
}

class StudentManagement {
    private Student[] students;
    private int studentCount;

    public StudentManagement() {
        students = new Student[5];
        studentCount = 0;
    }

    public void addStudent(Student student) {
        if (studentCount < students.length) {
            students[studentCount] = student;
            studentCount++;
        } else {
            System.out.println("No more students can be added.");
        }
    }

    public void displayAllStudents() {
        for (int i = 0; i < studentCount; i++) {
            Student student = students[i];
            System.out.println("Name: " + student.getName() +
                               ", ID: " + student.getId() +
                               ", Average Grade: " + student.calculateAverage());
        }
    }
}
