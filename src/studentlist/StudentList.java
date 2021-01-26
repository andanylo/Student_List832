package studentlist;

import java.util.Scanner;


/**
 *
 * @author paulbonenfant
 */
public class StudentList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        Student[] students = new Student[3];
        
        System.out.println("Enter student names");
        
        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter name for student " + (i + 1)); 
            String name = input.nextLine();
            Student student = new Student(name);
            students[i] = student;
        }
      
        String format = "Student name is %s\n";       
        for (Student student: students) {
            System.out.printf(format, student.getName());
        }       
    }
}

