
package edu.hpu.caranda.student_grades;

public class Student {

    String name, student_id; //Data field
    int currentPoints, maxPoints; //Data field

    //Constructor: Builds the object initially.
    public Student(String s1, String s2) {
        this.name = s1;
        this.student_id = s2;
        this.currentPoints = 0;
        this.maxPoints = 0;
    }

    //Method
    public void addGrade(int accumulated, int max) {
        this.currentPoints += accumulated;
        this.maxPoints += max;
    }
    //Method
    public double numberGrade() {
        return (double) this.currentPoints / (double) this.maxPoints;
    }
    //Method
    public String letterGrade() {
        String letterGrade;
        if (numberGrade() >= .97) {
            letterGrade = "A+";
        } else if (numberGrade() >= .93) {
            letterGrade = "A";
        } else if (numberGrade() >= .90) {
            letterGrade = "A-";
        } else if (numberGrade() >= .87) {
            letterGrade = "B+";
        } else if (numberGrade() >= .83) {
            letterGrade = "B";
        } else if (numberGrade() >= .80) {
            letterGrade = "B-";
        } else if (numberGrade() >= .77) {
            letterGrade = "C+";
        } else if (numberGrade() >= .73) {
            letterGrade = "C";
        } else if (numberGrade() >= .70) {
            letterGrade = "C-";
        } else if (numberGrade() >= .67) {
            letterGrade = "D+";
        } else if (numberGrade() >= .63) {
            letterGrade = "D";
        } else if (numberGrade() >= .60) {
            letterGrade = "D-";
        } else {
            letterGrade = "F";
        }
        return letterGrade;
    }
}
