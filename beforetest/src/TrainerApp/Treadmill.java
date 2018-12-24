
package TrainerApp;


public class Treadmill implements ExerciseMachine{
   private String name = "Treadmill" ;
   private int price = 25000 ;

    public Treadmill() {
    }

    public Treadmill(String name, int price) {
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
            return 350;
    }
    @Override
    public String toString() {
        return "Treadmill{" + "name=" + name + ", price=" + price + '}';
    }
   
}
