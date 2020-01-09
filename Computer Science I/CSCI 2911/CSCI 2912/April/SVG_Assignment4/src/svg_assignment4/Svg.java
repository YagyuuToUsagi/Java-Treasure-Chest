package svg_assignment4;

import java.util.ArrayList;
import java.io.PrintStream;

/**
 *
 * @author brianaranda
 */

class Svg {

    //Svg instance variables
    private ArrayList<Shape> shapes;
    private double height;
    private double width;

    //Svg constructor
    public Svg(double width, double height) {
        shapes = new ArrayList<Shape>();
        this.width = width;
        this.height = height;

    }

    //Returns height
    public double getHeight() {
        return height;
    }

    //Returns width
    public double getWidth() {
        return width;
    }

    //Adds shape, doesn't return anything.
    void addshape(Shape shape) {
        shapes.add(shape);

    }
    
    //Prints shapes Arraylist
    void printStuff(){
        for(int i =0; i < shapes.size();++i){
            System.out.println(shapes.get(i));
        }
    }
    
    @Override
    public String toString(){
        return "<svg width='"+width+"' height='"+height+"'> : (shapes) : </svg>";
    }

    void render(PrintStream out) {

    }

}
