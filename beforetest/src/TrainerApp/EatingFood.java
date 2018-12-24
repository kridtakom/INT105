
package TrainerApp;


public class EatingFood extends Food{
    private String foodTime;
    
    

   

    public String getFoodTime() {
        return foodTime;
    }

    public void setFoodTime(String foodTime) {
        this.foodTime = "Dinner";
    }
    public int getEnergy(){
       return 400; 
    }
    public int getEnergyMore(){
        return 7000;
    }

    @Override
    public String toString() {
        return "EatingFood{" + "foodTime=" + foodTime + '}';
    }
    
}
