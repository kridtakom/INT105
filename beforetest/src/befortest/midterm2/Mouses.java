package befortest.midterm2;

public interface Mouses {

    /*    private String colorMouse;

    public Mouses(String colorMouse) {
        this.colorMouse = colorMouse;
    }

    public String getColorMouse() {
        return colorMouse;
    }

    public void setColorMouse(String colorMouse) {
        this.colorMouse = colorMouse;
    }
    
   
//    public abstract void leftClick();
//    public abstract void rightClick();
//    public abstract void scoll(int value);
    
    public void leftClick() {
        System.out.println(getColorMouse() + " >> Click");
    }

    public void rightClick() {
        System.out.println(getColorMouse() + " >> Context Menu");
    }
    
    public void scoll(int value){
        if(value>0){
            System.out.println("Up "+(value*3)+" lines");
        } else{
            System.out.println("Down "+(value*3)+" lines");
        }
    }
    
    @Override
    public String toString() {
        return colorMouse+" mouse";
    }
    
     */
    public abstract void leftClick();

    public abstract void rightClick();

    public abstract void scoll(int value);

}
