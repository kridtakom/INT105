
package oop.AirConditioner;

public class AirConditioner {
    private String modelName;
    private String brandName;
    private  int temperature ;

   
    private boolean status;

    public AirConditioner(){
        this.temperature = 25;
    
    }
    
    public AirConditioner(String modelName, String brandName, boolean status) {
        this.modelName = modelName;
        this.brandName = brandName;
        this.status = status;
        this.temperature = 25;
    }
 public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public boolean isStatus() {
        return status;
       
    }

    public void setStatus(String status) {
        
        if(status.equalsIgnoreCase("true")){
           this.status=true;
        }
        else{
            this.status=false;
        }
   }
    
    public void tooCold(){
        
        String result;
        if(status=true){
            temperature = temperature-1;
            
        }else{
            result = "it's off";
        }
       
     }
    
    public void tooWarm(){
        String result;
        if(status=true){
            temperature = temperature+1;
        }else{
            result = "it's off";
        }
        
     }
    public String convertToFahrenheit(){
        String resulttmp;
        double temp;
        temp = ((temperature*9)/5.0)+32;
        resulttmp=temp+" F";
        return resulttmp;
    }

    @Override
    public String toString() {
        return "AirConditioner{" + "modelName=" + modelName + ", brandName=" + brandName + ", temperature=" + temperature + ", status=" + status + '}';
    }
}
