package Baitap;

import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class Student {

    String id;
    String fullName;
    float GPA;
    Date DateOfBirth;
    String major;

    public Student() {}
    

    Student(String id, String fullName, float GPA, Date DateOfBirth, String major) {
        this.id = id;
        this.fullName = fullName;
        this.DateOfBirth = DateOfBirth;
        this.GPA = GPA;
        this.major = major;
    }

    Student enterStudentInfo(Student student) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("ID: ");
        this.id = scanner.nextLine();
        System.out.println("Full Name: ");
        this.fullName = scanner.nextLine();
        System.out.println("GPA: ");
        this.GPA = scanner.nextFloat();
        scanner.nextLine();
        System.out.println("Date Of Birth: ");
        String DateOfBirthString = scanner.nextLine();
        try{
        this.DateOfBirth=sdf.parse(DateOfBirthString);}
        catch (Exception e){
                System.out.println("wrong format");
                }
        System.out.println("Major: ");
        this.major = scanner.nextLine();
        student =new Student(id, fullName, GPA, DateOfBirth, major);
        return this;
    }

    public String toString() {
        return "Student ID: " + this.id
                + "\nFull Name: " + this.fullName
                + "\nGPA: " + this.GPA
                + "\nDate of Birth: " + this.DateOfBirth
                + "\nMajor: " + this.major;
    }
}
