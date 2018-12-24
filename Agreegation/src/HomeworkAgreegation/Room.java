package HomeworkAgreegation;

public class Room {

    private int roomId;
    private  int floor;
    private Costomer owner;
    

    public Room(int roomId, int floor, Costomer owner) {
        this.roomId = roomId;
        this.floor = floor;
        this.owner = owner;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public Costomer getOwner() {
        return owner;
    }

    public void setOwner(Costomer owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Room{" + "roomId=" + roomId + ", floor=" + floor + ", owner=" + owner + '}';
    }
    
}
