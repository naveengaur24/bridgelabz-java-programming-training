package OOPS.Class;

public class Student {

    String name;
    int roll;
    int marks;

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Alice";
        student1.roll = 101;
        student1.marks = 85;
        System.out.println("Student Name: " + student1.name);
        System.out.println("Student Roll: " + student1.roll);
        System.out.println("Student Marks: " + student1.marks);

        Student student2 = new Student();
        student2.name = "Bob";
        student2.roll = 102;
        student2.marks = 90;
        System.out.println("\nStudent Name: " + student2.name);
        System.out.println("Student Roll: " + student2.roll);   
        System.out.println("Student Marks: " + student2.marks);
    }
}
