package shapedemo;

/**
 *
 * @author zhuyi
 */
public abstract class Shape {
     private String shapeName;
  private String color;

  public Shape(final String shapeName, final String color) {
    this.shapeName = shapeName;
    this.color = color;
  }

  public String getColor() {
    return this.color;
  }

  public abstract void show();
}
