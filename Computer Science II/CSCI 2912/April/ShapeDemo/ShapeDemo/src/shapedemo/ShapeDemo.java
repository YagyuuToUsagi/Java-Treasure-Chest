/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package shapedemo;

/**
 *
 * @author zhuyi
 */
public class ShapeDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Shape myShape;
    myShape = new Rectangle(8, 10, "Red");
    myShape.show();
    myShape = new Square(10, "Blue");
    myShape.show();
    }
}
