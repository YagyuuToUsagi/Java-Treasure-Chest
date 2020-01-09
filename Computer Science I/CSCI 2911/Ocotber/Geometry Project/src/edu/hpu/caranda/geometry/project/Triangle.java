package edu.hpu.caranda.geometry.project;

public class Triangle {
    
    Point a, b, c;
    Line AB, BC, AC;
    
    public Triangle(Point p1, Point p2, Point p3){
        a=new Point(p1.x, p1.y);
        b=new Point (p2.x, p2.y);
        c=new Point (p3.x, p3.y);
        
        AB=new Line(a, b);
        BC=new Line(b, c);
        AC=new Line(a, c);
        
        
    }
    
    public double perimeter(){  
        
        double perimeter=AB.length()+BC.length()+AC.length();
        return perimeter;
    }
    
    public double area(){
        double p=perimeter()/2;
        double area=Math.sqrt(p*(p-AB.length())*(p-BC.length())*(p-AC.length()));
        return area;
    }
    
    public boolean isIsosceles(){
        boolean isIsosceles=false;
        
        if(AB.length()==BC.length()){
            isIsosceles=true;
        }
        else if(BC.length()==AC.length()){
            isIsosceles=true;
        }
        else{
             isIsosceles=false;           
        }
        return isIsosceles;
    }
}
