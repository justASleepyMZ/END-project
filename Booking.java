import java.util.Date;

public class Booking {
    private Room room;
    private User user;
    private Date checkInDate;
    private Date checkOutDate;

    public Booking(Room room, User user, Date checkInDate, Date checkOutDate) {
        this.room = room;
        this.user = user;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }

    // Геттеры и сеттеры
    public Room getRoom() {
        return room;
    }

    public User getUser() {
        return user;
    }

    public Date getCheckInDate() {
        return checkInDate;
    }

    public Date getCheckOutDate() {
        return checkOutDate;
    }
}
