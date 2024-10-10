import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // 3.g
        Room r1 = new Room(2, 4);
        Room r2 = new Room(3, 5);
        Room r3 = new Room(4, 6);

        // 3.h
        ArrayList<Room> collectionOfRooms = new ArrayList<Room>();
        collectionOfRooms.add(r1);
        collectionOfRooms.add(r2);
        collectionOfRooms.add(r3);

        // 3.i
        Building build1 = new Building(collectionOfRooms, 1);

        // Testing number of lamps
        int lampCounter = countLampsInBuilding(build1);
        System.out.println("Number of lamps in building: " + lampCounter);
        // Testing number of windows
        int windowCounter = countWindowsInBuilding(build1);
        System.out.println("Number of windows in building: " + windowCounter);
        // Testing number of rooms
        int roomCounter = countRoomsInBuilding(build1);
        System.out.println("Number of rooms in building: " + roomCounter);
        // Testing isNormal condition
        boolean normalCondition = isNormal(build1);
        System.out.println("Is the building normal? " + normalCondition);
    }

    // 3.j
    public static int countLampsInBuilding(Building building) {
        int counter = 0;
        for (Room room : building.getRooms()) {
            counter += room.getNumberOfLamps();
        }
        return counter;
    }

    public static int countWindowsInBuilding(Building building) {
        int counter = 0;
        for (Room room : building.getRooms()) {
            counter += room.getNumberOfWindows();
        }
        return counter;
    }

    public static int countRoomsInBuilding(Building building) {
        return building.getRooms().size();
    }

    //3.k
    public static boolean isNormal(Building building) {
        return (building.getNumberOfFloors() >= countRoomsInBuilding(building));
    }

}