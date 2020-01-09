/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritancedemo;


public class Rectangle {
    private double length;
    private double width;
    private String color="Blue";
    
    public Rectangle(double length, double width){
        this.length=length;
        this.width=width;
        System.out.println("This is Superclass constructor 1!");
    }

//    public Rectangle(double length){
//        this.length=length;
//        this.width=length;
//        System.out.println("This is Superclass Constructor 2!");
//    }
//    
//    public Rectangle(){
//        this.length=0;
//        this.width=0;
//        System.out.println("This is Superclass Constructor 3!");
//    }
    
    public double getLength(){
        return length;
    }
    
    public double getArea(){
        return length*width;
    }
    
    public final String getshapeType(){
        return "This is a Rectangle.";
    }
    
    public void setColor(String newColor){
        this.color=newColor;
    }

}
