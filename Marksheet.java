package javaProject;
import java.util.Scanner;
class Student {
    Scanner input = new Scanner(System.in);
    String Name;
    String fatherName;
    String course;
    long Mobile;
    int age;
    long Addhar;
    void setDetails(){
        System.out.println("\n******Insert Student Details******");
        System.out.print("Enter Student Name          : ");
        Name = input.nextLine();
        System.out.print("Enter Student Father's Name : ");
        fatherName = input.nextLine();
        System.out.print("Enter Student Course Name   : ");
        course= input.nextLine();
        System.out.print("Enter Student Mobile Number : ");
        Mobile = input.nextLong();
        System.out.print("Enter Student Age           : ");
        age = input.nextInt();
        System.out.print("Enter Student Addhar Number : ");
        Addhar = input.nextLong();
        input.nextLine();
    }
    void getDetails(){
        System.out.println("\n******Student Details******");
        System.out.println("Student Name               : "+Name);
        System.out.println("Student Father's Name      : "+fatherName);
        System.out.println("Student Course Name        : "+course);
        System.out.println("Student Mobile Number      : "+Mobile);
        System.out.println("Student Age                : "+age);
        System.out.println("Student Addhar Number      : "+Addhar);
        
    }
}
class Exam extends Student{
    int java;
    int php;
    int dcn;
    int iot;
    int dbms;
    void setExamMarks(){
        System.out.println("******Insert Student******");
        System.out.print("Enter Java Marks           : ");
        java = input.nextInt();
        System.out.print("Enter php Marks            : ");
        php = input.nextInt();
        System.out.print("Enter Data Network Marks   : ");
        dcn = input.nextInt();
        System.out.print("Enter Internet Things Marks : ");
        iot = input.nextInt();
        System.out.print("Enter DBMS Marks : ");
        dbms = input.nextInt();
    }
    void getExamMarks(){
        System.out.println("******Insert Exam Marks******");
        System.out.println("Java                       : "+java);
        System.out.println("Php                        : "+php);
        System.out.println("Data Communication Network : "+dcn);
        System.out.println("Internet of Things         : "+iot);
        System.out.println("Dbms                       : "+dbms);
        int total = (java+php+dcn+iot+dbms);
        double percentage = (double)total/5;
        System.out.println("Total marks of student is  : "+total);
        System.out.println("Percentage of Student is   : "+percentage+" %");
        String grade;
        
        if (percentage >= 90) {
            grade = "A+";
        } else if (percentage >= 80) {
            grade = "A";
        } else if (percentage >= 70) {
            grade = "B+";
        } else if (percentage >= 60) {
            grade = "B";
        } else if (percentage >= 50) {
            grade = "C";
        } else if (percentage >= 40) {
            grade = "D";
        } else {
            grade = "F (Fail)";
        }
        System.out.println("Grade                      : " + grade);
        if (percentage >= 40) {
            System.out.println("Remark                     : Congratulations! You Passed ");
        } else {
            System.out.println("Remark                     : Better Luck Next Time ");
        }
    }
}
public class Marksheet extends Exam{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();
        Exam[] students = new Exam[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Roll no : "+i + 1);
            students[i] = new Exam();
            students[i].setDetails();
            students[i].setExamMarks();
        }
        for (int i = 0; i < n; i++) {
            System.out.print("Marksheet for Student " + (i + 1));
            students[i].getDetails();
            students[i].getExamMarks();
        }
        sc.close();
    }
}
