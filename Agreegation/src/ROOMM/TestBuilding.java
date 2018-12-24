package ROOMM;

public class TestBuilding {

    public static void main(String[] args) {
        Address sitAddr = new Address("126 ","PraCha U Tid","BKK", "10140");
        Building sitBuilding = new Building ("SIT Building",sitAddr);
        System.out.println(sitBuilding);
        
    }
}
