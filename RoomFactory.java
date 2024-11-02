package main;

public class RoomFactory {
    public Room createRoom(String roomType) {
        switch (roomType) {
            case "Standard":
                return new StandardRoom();
            case "Luxury":
                return new LuxuryRoom();
            default:
                throw new IllegalArgumentException("Unknown room type: " + roomType);
        }
    }
}
