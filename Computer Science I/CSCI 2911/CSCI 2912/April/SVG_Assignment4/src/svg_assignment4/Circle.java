package svg_assignment4;

import java.io.PrintStream;

/**
 *
 * @author brianaranda
 */

class Circle extends Shape {

    //Circle instance variables
    private double cx;
    private double cy;
    private double r;

    //Circle constructor
    public Circle(double cx, double cy, double r) {
        this.cx = cx;
        this.cy = cy;
        this.r = r;
    }

    //Returns double value cx of circle
    public double getCx() {
        return cx;
    }

    //Returns double value cy of circle
    public double getCy() {
        return cy;
    }
    
    //Returns the radius of the circe
    public double getR() {
        return r;
    }

    @Override
    //Displays the information of the circle
    public String toString() {
        return "<circle cx='"+cx+"' cy='"+cy+"' r='"+r+"/>";
    }

    @Override
    void renderAttributes(PrintStream out) {

    }

}