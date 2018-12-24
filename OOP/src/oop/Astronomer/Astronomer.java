
package oop.Astronomer;


public class Astronomer {
    private String name;
    private long ID;
    private int heigh;
    private double weight;
    private boolean nationallity;
    private String Nationallity;
    private double wplanet;
    private String loseplanet;
    private static int count ,countThai,countNotThai,m,v,j,s;
    

    public Astronomer() {
    count++;
    }

    public Astronomer(String name, long ID, int heigh, double weight, String Nationallity, String loseplanet) {
        count++;
        this.name = name;
        this.ID = ID;
        this.heigh = heigh;
        this.weight = weight;
        this.loseplanet = loseplanet;
        this.Nationallity = Nationallity;
        if(Nationallity.equalsIgnoreCase("thailand")){
            this.nationallity=true;
            countThai++;
        }else{
            this.nationallity=false;
            countNotThai++;
        }
        if(loseplanet.equals("1")){
            m++;
        }else if(loseplanet.equals("2")){
            v++;
        }else if(loseplanet.equals("3")){
            j++;
        }else if(loseplanet.equals("4")){
            s++;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public int getHeigh() {
        return heigh;
    }

    public void setHeigh(int heigh) {
        this.heigh = heigh;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isNationallity() {
        return nationallity;
    }

    public void setNationallity(boolean nationallity) {
        this.nationallity = nationallity;
    }

    public double getWplanet() {
        return wplanet;
    }

    public void setWplanet(double wplanet) {
        this.wplanet = wplanet;
    }

    public String getLoseplanet() {
        return loseplanet;
    }

    public void setLoseplanet(String loseplanet) {
        this.loseplanet = loseplanet;
    }

    public static int getCount() {
        return count;
    }

    public static int getCountThai() {
        return countThai;
    }

    public static int getCountNotThai() {
        return countNotThai;
    }

    public static int getM() {
        return m;
    }

    public static int getV() {
        return v;
    }

    public static int getJ() {
        return j;
    }

    public static int getS() {
        return s;
    }

    public String getNationallity() {
        return Nationallity;
    }

    public void setNationallity(String Nationallity) {
        this.Nationallity = Nationallity;
    }

  
    
    
    public String weightConverter(String loseplanet,double weight){
        String sumweight = null ;
        if(loseplanet.equals("1")){
            sumweight = "Mercury : "+(weight* 0.4);
        }else  if(loseplanet.equals("2")){
            sumweight = "Venus : "+(weight* 0.9);
        }else  if(loseplanet.equals("3")){
            sumweight = "Jupiter : "+(weight* 2.5);
        }else  if(loseplanet.equals("4")){
            sumweight = "Saturn : "+(weight* 1.1);
        }
        
        return sumweight; 
        
        
    }

    @Override
    public String toString() {
        return name+"("+Nationallity+")"+
                "ID-"+ID+
                ","+
                "From Earth :"+
                weight+"kg To";
    }
    
    
    
    
    
}
