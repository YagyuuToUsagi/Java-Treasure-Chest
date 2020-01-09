package svg_assignment4;

import java.io.PrintStream;

/**
 *
 * @author brianaranda
 */
class Rectangle extends Shape {

    //Rectangle instance variables
    private double x;
    private double y;
    private double width;
    private double height;

    //Rectangle constructor
    public Rectangle(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    //Returns double value x for rectangle
    public double getX() {
        return x;
    }

    //Returns double value y for rectangle
    public double getY() {
        return y;
    }

    //Returns double value width for rectangle
    public double getWidth() {
        return width;
    }

    //Returns double value of height
    public double getHeight() {
        return height;
    }

    @Override
    //Displays the information of the rectangle
    public String toString() {
        return "<rect x='" + x + "' y='" + y + "' width='" + width + "' height='" + height + "'/>";
    }

    @Override
    void renderAttributes(PrintStream out) {

    }

}

