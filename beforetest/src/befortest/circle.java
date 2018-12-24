package befortest;

public class circle implements Shape {

    private double radius;

    public circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double area() {

        return Math.PI * Math.pow(radius, 2);

    }

    public double perimeter() {

        return 2 * Math.PI * radius;

    }

    @Override
    public String toString() {
        return "Shape area " + area() + " perimeter " + perimeter();
    }

}
