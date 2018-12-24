package HomeworkAgreegation;

public class Building {

    private Room[] rooms;
    private String name;

    public Building(Room[] rooms, String name) {

        this.name = name;
        this.rooms = rooms;

    }

    public void createRoom() {
        rooms = new Room[20];
        Costomer ctm = new Costomer(0, null, null);
        for (int i = 0; i < this.rooms.length; i++) {
            rooms[i] = new Room((i + 1), (i + i), ctm);
        }
    }

    public Room[] getRooms() {
        return rooms;
    }

    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int countPeople() {
        int count = Costomer.getCount();

        return count;
    }

    public int countPeople(String gender) {
        int count = 0;
        if (gender.equalsIgnoreCase("m")) {
            for (int i = 0; i < rooms.length; i++) {
                if (rooms[i].getOwner().getGender().equalsIgnoreCase("male")) {
                    count++;
                }
            }
        } else if (gender.equalsIgnoreCase("f")) {
            for (int i = 0; i < rooms.length; i++) {
                if (rooms[i].getOwner().getGender().equalsIgnoreCase("female")) {
                    count++;
                }
            }
        }
        return count;
    }

    @Override
    public String toString() {
        return "Building{" + "rooms=" + rooms + ", name=" + name + '}';
    }
    
}
