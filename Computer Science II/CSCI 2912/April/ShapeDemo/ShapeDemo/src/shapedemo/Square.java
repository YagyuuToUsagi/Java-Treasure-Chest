/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package shapedemo;

/**
 *
 * @author zhuyi
 */
public class Square  extends Rectangle {
     private int edge;

  public Square(final int edge, final String color) {
    super(edge, edge, color);
   
    this.edge = edge;
  }

    @Override
  public void show() {
    System.out.println("A square with edge length "
        + this.edge
        + " and color "
        + this.getColor());
  }
}
