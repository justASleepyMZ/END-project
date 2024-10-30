// Abstract class for different types of Rooms
abstract class Room {
    protected String type;
    protected double rate;

    public abstract double getRate();
    public String getType() {
        return type;
    }
}

// Concrete Room Classes
class SingleRoom extends Room {
    public SingleRoom() {
        this.type = "Single";
        this.rate = 100.0;
    }

    @Override
    public double getRate() {
        return rate;
    }
}

class DoubleRoom extends Room {
    public DoubleRoom() {
        this.type = "Double";
        this.rate = 150.0;
    }

    @Override
    public double getRate() {
        return rate;
    }
}

// RoomFactory to create different Room objects
class RoomFactory {
    public static Room createRoom(String type) {
        switch (type.toLowerCase()) {
            case "single":
                return new SingleRoom();
            case "double":
                return new DoubleRoom();
            default:
                throw new IllegalArgumentException("Unknown room type.");
        }
    }
}
