import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BookingService {
    private List<Booking> bookings = new ArrayList<>();

    public boolean bookRoom(Room room, User user, Date checkIn, Date checkOut) {
        if (room != null && room.getRate() > 0) {
            Booking booking = new Booking(room, user, checkIn, checkOut);
            bookings.add(booking);
            return true;
        }
        return false;
    }

    public List<Booking> getBookings() {
        return bookings;
    }
}
