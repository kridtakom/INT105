
package TrainerApp;


public class Exercise {
    private Treadmill treadmill;
    private Elliptical elliptical;

    public Exercise() {
        this.treadmill=new Treadmill();
        this.elliptical=new Elliptical();
    }
    
    public Exercise(Treadmill treadmill, Elliptical elliptical) {
        this.treadmill = treadmill;
        this.elliptical = elliptical;
    }

    public Treadmill getTreadmill() {
        return treadmill;
    }

    public void setTreadmill(Treadmill treadmill) {
        this.treadmill = treadmill;
    }

    public Elliptical getElliptical() {
        return elliptical;
    }

    public void setElliptical(Elliptical elliptical) {
        this.elliptical = elliptical;
    }

    public int courseA(){
        return 350+200; 
    }
    public int courseB(){
        return 525+15;
    }
    public int sitUp(int amount){
        return (int)(amount*0.5);
    }
    public int  playTreadmill(int Time){
        return (350*Time)/60;
    }
    public int playElliptical(int Time){
        return (400*Time)/60;
    }
    @Override
    public String toString() {
        return "Exercise{" + "treadmill=" + treadmill + ", elliptical=" + elliptical + '}';
    }
    
}
