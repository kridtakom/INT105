
package TrainerApp;


public class Elliptical implements ExerciseMachine  {
    private String name = "Elliptical";
    private int price = 17500;

    public Elliptical() {
    }

    public Elliptical(String name, int price) {
        this.name = name;
        this.price = price;
    }
   
   
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int helpMetabolism() {
            return 400;
    }
    @Override
    public String toString() {
        return "Treadmill{" + "name=" + name + ", price=" + price + '}';
    }
}
