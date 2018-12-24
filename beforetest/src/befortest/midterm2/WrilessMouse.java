
package befortest.midterm2;


public class WrilessMouse implements Mouses{
    private String color;
    private double signal;

    public WrilessMouse(String color , double signal) {
        this.color=color;
        this.signal = signal;
    }

    public double getSignal() {
        return signal;
    }

    public void setSignal(double signal) {
        this.signal = signal;
    }
    @Override
    public void leftClick() {
        System.out.println(color+ " >> Click"); 
    }
   

    @Override
    public void rightClick() {
        System.out.println(color + " >> Context Menu");
    }
    
    

    @Override
    public void scoll(int value) {
        if(value>0){
            System.out.println("Up "+(value*3)+" lines");
        } else{
            System.out.println("Down "+(value*3)+" lines");
        }
    }

    @Override
    public String toString() {
        return color+" mouse"+" - Wriseless mouse with  "+signal+" Wriseless technology ";
    }
    
    
    
}
