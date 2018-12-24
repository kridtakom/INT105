
package ROOMM;


public class Room {
   private String roomId;
   private String floorNo;
   private double roomArea;

    public Room() {
    }

    public Room(String roomId, String floorNo, double roomArea) {
        this.roomId = roomId;
        this.floorNo = floorNo;
        this.roomArea = roomArea;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public String getFloorNo() {
        return floorNo;
    }

    public void setFloorNo(String floorNo) {
        this.floorNo = floorNo;
    }

    public double getRoomArea() {
        return roomArea;
    }

    public void setRoomArea(double roomArea) {
        this.roomArea = roomArea;
    }

    @Override
    public String toString() {
        return "Room{" + "roomId=" + roomId + ", floorNo=" + floorNo + ", roomArea=" + roomArea + '}';
    }
   
}
