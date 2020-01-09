package edu.hpu.caranda.geometry.project;

public class Point {

    double x, y;

    public Point(double n1, double n2) {
        x = n1;
        y = n2;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
    
    public boolean equals(Point a){
        return x==a.x && y==a.y;
    }
}
