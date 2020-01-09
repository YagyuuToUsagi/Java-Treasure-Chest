package edu.hpu.caranda.geometry.project;

public class GeometryProject {

    public static void main(String[] args) {

        Point a = new Point(2, 3);
        Point b= new Point (3, 4);
        Point c=new Point(4, 5);
        Line AB=new Line (a, b);
        Line BC=new Line (b, c);
        Line AC=new Line (a, c);
        
        
        System.out.println(a.equals(b));
        System.out.println("Point a is "+a+".");
        System.out.println("Point b is "+b+".");
        System.out.println("Point c is "+c+".");
        System.out.println();
        
    }

}
