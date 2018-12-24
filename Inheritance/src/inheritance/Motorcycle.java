package inheritance;

public class Motorcycle extends Vehicle {

    private String model;
    private String manufacturer;
    private double gasoline;

    public Motorcycle(int VerhicleId, String model, String manufacturer, double gasoline) {
        super(VerhicleId);
        this.model = model;
        this.manufacturer = manufacturer;
        this.gasoline = gasoline;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getGasoline() {
        return gasoline;
    }

    public void setGasoline(double gasoline) {
        this.gasoline = gasoline;
    }

    public boolean checkConsumeEnergy(double distance) {

        
        if (gasoline*1/0.12>=distance) {
            return true;
        } else {
            return false;
        }

    }

    @Override
    public String toString() {
        return super.toString() + "Motorcycle{" + "model=" + model + ", manufacturer=" + manufacturer + ", gasoline=" + gasoline + '}';
    }

}
