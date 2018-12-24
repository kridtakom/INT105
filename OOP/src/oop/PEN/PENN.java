
package oop.PEN;


public class PENN {
    
    private long productId;
    private String model;
    private String brand ;
    private double price ;
    private static int numOfPen;
    
    public PENN(){
        numOfPen++;
    }
    
    public PENN(long productId){
        numOfPen++;
        this.productId = productId;
        
    }
     
    public PENN(long productId, String model){
        numOfPen++;
        this.productId = productId;
        this.model = model;
    }
    
    public PENN (long productId, String model, String brand){
        numOfPen++;
        this.productId = productId;
        this.model = model;
        this.brand = brand ;
    }
    
    public PENN (long productId, String model, String brand, double price){
        numOfPen++;
        this.productId = productId;
        this.model = model;
        this.brand = brand ;
        this.price = price ;
    }
    
    public long getProductId(){
        return productId; 
    }
    public void setProductId(long productId){
        this.productId = productId;
    }
    
    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public static int getNumOfPen(){
        return numOfPen;
    }
            
    
    
    @Override
    public String toString(){
        String output=null;
        output = "Pen id "+productId+" model "+model+" "+brand+" "+((int)price);
        return output;
    }
}
