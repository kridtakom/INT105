package ROOMM;

public class Building {

    private String buildingName;
    private Address buildingAddr;
    private Room buildingRooms[];

    public Building() {
        buildingName = "unknow";
        buildingAddr = null;
        createRoomInBuilding();
    }

    public Building(String name, Address addr) {
        buildingName = name;
        buildingAddr = addr;
        createRoomInBuilding();

    }

    public void createRoomInBuilding() {
        buildingRooms = new Room[100];
        for (int i = 0; i < buildingRooms.length; i++) {
            buildingRooms[i] = new Room("room" + (i + 1), "floor"+(i + 1), (i + 1) * 100);
        }

    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public Address getBuildingAddr() {
        return buildingAddr;
    }

    public void setBuildingAddr(Address buildingAddr) {
        this.buildingAddr = buildingAddr;
    }

    public Room[] getBuildingRooms() {
        return buildingRooms;
    }

    public void setBuildingRooms(Room[] buildingRooms) {
        this.buildingRooms = buildingRooms;
    }

    @Override
    public String toString() {
        String result = "buildingName = "+ buildingName+"\n building Address = "+buildingAddr+"\n";
        for (int i = 0; i < buildingRooms.length; i++) {
            result += buildingRooms[i]+"\n";
        }
        //return "Building{" + "buildingName=" + buildingName + ", buildingAddr=" + buildingAddr + ", buildingRooms=" + buildingRooms + '}';
        return result;
    }
    
}
