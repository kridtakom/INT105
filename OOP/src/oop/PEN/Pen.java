
package oop.PEN;


public class Pen {
    private long productId;
    private String model;
    private String brand;
    private double price;
    private static int numberOfPen;
    private static String allPens="";
    
    @Override
    public String toString() {
        return "PenId : " + productId + "\t" 
                + "Penmodel : " + model + "\t"
                + "Penbrand : " + brand + "\t"
                + "Penprice : " + price ;

    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
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
    
    public Pen(){
        numberOfPen++;
        allPens += "";
    }
    
    public Pen(long productId){
        this.productId=productId;
        numberOfPen++;
        allPens += "Pen id: "+this.productId+"\n";
    }
    
    public Pen(long productId,String model){
        this.productId=productId;
        this.model=model;
        numberOfPen++;
        allPens += "Pen id: "+this.productId+"\t"+"Model: "+this.model+"\n";
    }
    
    public Pen(long productId,String model,String brand){
        this.productId=productId;
        this.model=model;
        this.brand=brand;
        numberOfPen++;
        allPens += "Pen id: "+this.productId+"\t"+"Model: "+this.model+"\t"+
                "Brand: "+this.brand+"\n";
    }
    
    public Pen(long productId,String model,String brand,double price){
        this.productId=productId;
        this.model=model;
        this.brand=brand;
        this.price=price;
        numberOfPen++;
        allPens += "Pen id: "+this.productId+"\t"+"Model: "+this.model+"\t"+
                "Brand: "+this.brand+"\t"+"Price: "+this.price+"\n";
    }
    
     

     public static int numberOfPen () {
        return numberOfPen;
     }
     
     public static String allPens(){
         return Pen.allPens;
     }

    
}
