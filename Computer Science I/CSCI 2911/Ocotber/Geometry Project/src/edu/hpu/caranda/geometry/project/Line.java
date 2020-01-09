package edu.hpu.caranda.geometry.project;

public class Line {
    
    Point p1, p2;
    
    public Line(Point a, Point b){
        p1=new Point(a.x, a.y);
        p2=new Point (b.x, b.y);
    }
    
    public double length(){
        double deltaX=p2.x-p1.x;
        double deltaY=p2.y-p1.y;
        double length=Math.sqrt((deltaX*deltaX)+(deltaY*deltaY));
        return length;
    }
    
    public double slope(){
        double deltaX=p2.x-p1.x;
        double deltaY=p2.y-p1.y;
        double slope=deltaY/deltaX;
        return slope;
    }
    
    public String toString(){
        return "(" + p1 + ", " + p2 + ")";
    }
    
    
}
