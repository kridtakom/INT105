
package oop.AirConditioner;


public class TestAirConditioner {
    
    public static void main(String[] args) {
        
        AirConditioner c1 = new AirConditioner("T002","mitsubishi",false);
        
        c1.tooCold();
      
        System.out.println(c1);
      
//        c1.setStatus(false);
//        c1.setTemperature(30);
//        c1.tooCold();
//        System.out.println("cold: "+c1.getTemperature());
//        c1.setTemperature(32);
//        c1.tooWarm();
//        System.out.println("Warm: "+c1.getTemperature());
//        System.out.println(c1.convertToFahrenheit());
       
    }
 }

