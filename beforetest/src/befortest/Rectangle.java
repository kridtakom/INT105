package befortest;

public class Rectangle implements Shape {

    private double width;
    private double high;

    public Rectangle(double width, double high) {
        this.width = width;
        this.high = high;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public double area() {
        return width * high;
    }

    public double perimeter() {
        return (width + high) * 2;
    }

    @Override
    public String toString() {
        return "Shape area " + area() + " perimeter " + perimeter();
    }

}
