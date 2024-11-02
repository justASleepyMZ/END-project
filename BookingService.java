package main;

public class BookingService {
    private static BookingService instance;

    private BookingService() {}

    public static BookingService getInstance() {
        if (instance == null) {
            instance = new BookingService();
        }
        return instance;
    }

    public void book(String roomType, String user) {
        System.out.println("Booking " + roomType + " room for user: " + user);
    }
}
