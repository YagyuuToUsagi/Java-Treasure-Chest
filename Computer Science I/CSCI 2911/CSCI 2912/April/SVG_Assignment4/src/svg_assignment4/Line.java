/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package svg_assignment4;

import java.io.PrintStream;
/**
 *
 * @author brianaranda
 */
class Line extends Shape {

    //Line instance variables
    private double x1;
    private double y1;
    private double x2;
    private double y2;

    //Line constructor
    public Line(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;

    }

    @Override
    //Displays information of the line
    public String toString() {
//        return "Line{" + "x1=" + x1 + ", y1=" + y1 + ", x2=" + x2 + ", y2=" + y2 + '}';
        return "<line x1='"+x1+"' y1='"+y1+"'x2='"+x2+"'y2='"+y2+"'>";
    }

    //Returns point x1
    public double getX1() {
        return x1;
    }

    //Returns point y1
    public double getY1() {
        return y1;
    }
   
    //Returns point x2
    public double getX2() {
        return x2;
    }
    //Returns point y2
    public double getY2() {
        return y2;
    }

    @Override
    void renderAttributes(PrintStream out) {

    }

}