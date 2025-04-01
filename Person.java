 class Person {
    String name, gender, address;
    int age;

    Person(String name, String gender, String address, int age) {
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.age = age;
    }
}

class Employee extends Person {
    String empId, companyName, qualification;
    double salary;

    Employee(String name, String gender, String address, int age, String empId, String companyName, String qualification, double salary) {
        super(name, gender, address, age);
        this.empId = empId;
        this.companyName = companyName;
        this.qualification = qualification;
        this.salary = salary;
    }
}

class Teacher extends Employee {
    String subject, department, teacherId;

    Teacher(String name, String gender, String address, int age, String empId, String companyName, String qualification, double salary, String subject, String department, String teacherId) {
        super(name, gender, address, age, empId, companyName, qualification, salary);
        this.subject = subject;
        this.department = department;
        this.teacherId = teacherId;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
        System.out.println("EmpId: " + empId);
        System.out.println("Company Name: " + companyName);
        System.out.println("Qualification: " + qualification);
        System.out.println("Salary: " + salary);
        System.out.println("Subject: " + subject);
        System.out.println("Department: " + department);
        System.out.println("TeacherId: " + teacherId);
        System.out.println("-------------------------------");
    }
}

public class Main {
    public static void main(String[] args) {
        int n = 2; 
        Teacher[] teachers = new Teacher[n];

        
        teachers[0] = new Teacher("Alice", "Female", "New York", 30, "E001", "ABC School", "MSc", 50000, "Mathematics", "Science", "T001");
        teachers[1] = new Teacher("Bob", "Male", "Los Angeles", 35, "E002", "XYZ School", "PhD", 60000, "Physics", "Science", "T002");

       
        for (int i = 0; i < n; i++) {
            teachers[i].displayDetails();
        }
    }
}

