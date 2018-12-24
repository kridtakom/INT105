
package TrainerApp;

public abstract class Food {
    private String nameFood;
    private int price;

    public Food() {
    }
    

    public Food(String nameFood, int price) {
        this.nameFood = nameFood;
        this.price = price;
    }

    public String getNameFood() {
        return nameFood;
    }

    public void setNameFood(String nameFood) {
        this.nameFood = nameFood;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    public abstract int getEnergy();

    @Override
    public String toString() {
        return "Food{" + "nameFood=" + nameFood + ", price=" + price + '}';
    }
    
    
}
