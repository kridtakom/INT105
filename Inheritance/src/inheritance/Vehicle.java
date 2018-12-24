
package inheritance;


public abstract class Vehicle {
    private int VehicleId;

    public Vehicle(int VehicleId) {
        this.VehicleId = VehicleId;
    }

    public int getVehicleId() {
        return VehicleId;
    }

    public void setVerhicleId(int VerhicleId) {
        this.VehicleId = VerhicleId;
    }
    
    public abstract boolean checkConsumeEnergy(double distance); 

    @Override
    public String toString() {
        return "Verhicle{" + "VerhicleId=" + VehicleId + '}';
    }
    
    
}
