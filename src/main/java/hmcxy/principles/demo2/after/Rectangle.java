package hmcxy.principles.demo2.after;

/**
 * 长方形
 */
public class Rectangle implements Quadrilateral{

    private double length;

    private double width;

    @Override
    public double getLength() {
        return length;
    }

    @Override
    public double getWidth() {
        return width;
    }
}
