
package oop.Square;

public class Square {
    
    private int width;
    private int sumwidth;
    
    public Square (){

        this.sumwidth = width*width;
    }
    public Square (int width){
        this.width = width;
        this.sumwidth = width*width;
    }
 
        
    public int getWidth(){
        return width;
    }
    public void setWidth(int width){
         this.width =width;
    }

   
 
  
    
@Override
    public String toString(){
        return "Area : "+sumwidth+
                "\n================================================================";
    }
}
