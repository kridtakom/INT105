
package befortest.Midterm3;


public class Rental {
    private Customer c1;
    private Car car;
    private int hours;

    public Rental(Customer c1, Car car, int hours) {
        this.c1 = c1;
        this.car = car;
        this.hours = hours;
    }

    public Customer getC1() {
        return c1;
    }

    public void setC1(Customer c1) {
        this.c1 = c1;
    }

    public Car getCar() {
        return car;
    }

    public void setCar1(Car car) {
        this.car = car;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }
    public int addHours(int plushours){
         return this.hours += plushours;
    }

    @Override
    public String toString() {
        return "Customer: "+c1.toString()+" rent car license plate: "+car.toString()+" Rent "+this.hours +"Total "+(this.hours*car.getPrice());
    }
    
}
