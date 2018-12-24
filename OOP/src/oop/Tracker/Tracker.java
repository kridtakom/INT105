
package oop.Tracker;


public class Tracker {
    private double xPosition;
    private double yPosition;
    private char type;

    public Tracker() {
    }

    public Tracker(double x, double y) {
        this.xPosition = x;
        this.yPosition = y;
    }

    public double getxPosition() {
        return xPosition;
    }

    public void setxPosition(double xPosition) {
        this.xPosition = xPosition;
    }

    public double getyPosition() {
        return yPosition;
    }

    public void setyPosition(double yPosition) {
        this.yPosition = yPosition;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }
    public double getDistance(double x, double y){
        double distance = (Math.sqrt(Math.pow(x-xPosition, 2)+Math.pow(y-yPosition, 2)));
        return distance;
    }

    @Override
    public String toString() {
        return "end" ;
    }
    
}
