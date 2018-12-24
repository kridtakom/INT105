package befortest.midterm2;

public class WireMouse implements Mouses {

    private double lineMouse;
    private String connect;
    private String color;

    public WireMouse(String color, double lineMouse, String connect) {
        this.color=color;
        this.lineMouse = lineMouse;
        this.connect = connect;
    }

    public double getLineMouse() {
        return lineMouse;
    }

    public void setLineMouse(double lineMouse) {
        this.lineMouse = lineMouse;
    }

    public String getConnect() {
        return connect;
    }

    public void setConnect(String connect) {
        this.connect = connect;
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
        return color+" mouse"+" - Wrise mouse with cable length "+lineMouse+" m, "+this.connect+" Conector "  ;
    }
    
}
