class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Address {
    protected String city;
    protected String state;

    public Address(String city, String state) {
        this.city = city;
        this.state = state;
    }

    public void displayAddress() {
        System.out.println("City: " + city);
        System.out.println("State: " + state);
    }
}

class Student extends Person {
    private int rollNumber;
    private String course;

    public Student(String name, int age, int rollNumber, String course) {
        super(name, age);
        this.rollNumber = rollNumber;
        this.course = course;
    }

    public void displayStudentDetails() {
        super.displayDetails();
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Course: " + course);
    }
}

class StudentWithAddress extends Student {
    private Address address;

    public StudentWithAddress(String name, int age, int rollNumber, String course, Address address) {
        super(name, age, rollNumber, course);
        this.address = address;
    }

    public void displayStudentWithAddress() {
        super.displayStudentDetails();
        address.displayAddress();
    }
}

public class StudentRecordManagementSystem {
    public static void main(String[] args) {
        Address studentAddress = new Address("Cityville", "Stateville");
        StudentWithAddress student = new StudentWithAddress("John", 20, 101, "Computer Science", studentAddress);
        student.displayStudentWithAddress();
    }
}