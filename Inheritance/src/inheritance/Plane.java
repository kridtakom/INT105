
package inheritance;


public class Plane extends Vehicle {

private String model;
private String airway;
private double kerosean;

    public Plane( int VerhicleId, String model, String airway, double kerosean) {
        super(VerhicleId);
        this.model = model;
        this.airway = airway;
        this.kerosean = kerosean;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getAirway() {
        return airway;
    }

    public void setAirway(String airway) {
        this.airway = airway;
    }

    public double getKerosean() {
        return kerosean;
    }

    public void setKerosean(double kerosean) {
        this.kerosean = kerosean;
    }
    
    public  boolean checkConsumeEnergy(double distance){
        
        
        if (kerosean*10>=distance) {
            return true;
        } else {
            return false;
        }

    }

    @Override
    public String toString() {
        return super.toString()+"Plane{" + "model=" + model + ", airway=" + airway + ", kerosean=" + kerosean + '}';
    }
    
       

}
