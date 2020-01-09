/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package shapedemo;

/**
 *
 * @author zhuyi
 */
public class Rectangle extends Shape {
    private int length;
    private int width;

  public Rectangle(final int length, final int width, final String color) {
    super("Rectangle", color);
    this.length = length;
    this.width = width;
  }

    @Override
  public void show() {
    System.out.println("A rectangle with length "
        + this.length
        + " and width "
        + this.width
        + " and color "
        + this.getColor());
  }
}
