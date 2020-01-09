package inheritancedemo;


public class Square extends Rectangle {
    private double edge;
    
    public Square(double edge){
        super(edge, edge);
        this.edge=edge;
        System.out.println("This is the subclass constructor!");
    }

    
    public String getShapeType() {
        return "This is a Square!";
    }
    
}
