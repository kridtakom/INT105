
package befortest.Midterm3;


public class Car {
    private String licence;
    private double price;

    public Car(String licence, double price) {
        this.licence = licence;
        this.price = price;
    }

    public String getLicence() {
        return licence;
    }

    public void setLicence(String licence) {
        this.licence = licence;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return " rent Car licence plate: " + licence + ", price " + price + " per hour";
    }
    
    
}
