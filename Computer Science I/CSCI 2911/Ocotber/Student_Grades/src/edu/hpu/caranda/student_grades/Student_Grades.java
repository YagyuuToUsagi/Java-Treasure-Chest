package edu.hpu.caranda.student_grades;

import java.util.Scanner;
import java.io.*;

public class Student_Grades {

    public static void main(String[] args) throws IOException {
        Scanner inFile = new Scanner(new File("grades.txt"));

        Student s1;
        while (inFile.hasNext()) {
            String name = inFile.next();
            String id = inFile.next();
            int assignment = inFile.nextInt();
            s1 = new Student(name, id);

            for (int i = 0; i < assignment; i++) {
                int currentPoints = inFile.nextInt();
                int maxPoints = inFile.nextInt();
                s1.addGrade(currentPoints, maxPoints);
            }
            System.out.println("You've scored " + s1.numberGrade() + ", a " + s1.letterGrade()+". ");
        }
        inFile.close();
    }
}
