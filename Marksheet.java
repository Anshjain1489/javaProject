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
        System.out.println("******Insert Student Details******");
        System.out.print("Enter Student Name : ");
        Name = input.nextLine();
        System.out.print("Enter Student Father's Name : ");
        fatherName = input.nextLine();
        System.out.print("Enter Student Course Name : ");
        course= input.nextLine();
        System.out.print("Enter Student Mobile Number : ");
        Mobile = input.nextLong();
        System.out.print("Enter Student Age : ");
        age = input.nextInt();
        System.out.print("Enter Student Addhar Number : ");
        Addhar = input.nextLong();
    }
    void getDetails(){
        System.out.println("******Student Details******");
        System.out.println("Student Name : "+Name);
        System.out.println("Student Father's Name : "+fatherName);
        System.out.println("Student Course Name : "+course);
        System.out.println("Student Mobile Number : "+Mobile);
        System.out.println("Student Age : "+age);
        System.out.println("Student Addhar Number : "+Addhar);
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
        System.out.print("Enter Java Marks : ");
        java = input.nextInt();
        System.out.print("Enter php Marks : ");
        php = input.nextInt();
        System.out.print("Enter Data Communication Network Marks : ");
        dcn = input.nextInt();
        System.out.print("Enter Internet of Things Marks : ");
        iot = input.nextInt();
        System.out.print("Enter DBMS Marks : ");
        dbms = input.nextInt();
    }
    void getExamMarks(){
        System.out.println("******Student Marksheet******");
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
        
    }
}
public class Marksheet extends Exam{
    public static void main(String[] args) {
        Marksheet Ansh = new Marksheet();
        Ansh.setDetails();
        Ansh.setExamMarks();
        Ansh.getDetails();
        Ansh.getExamMarks();
    }
}
