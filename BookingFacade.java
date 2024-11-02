package main;

public class BookingFacade {
    private RoomService roomService;
    private UserService userService;
    private BookingService bookingService;

    public BookingFacade() {
        this.roomService = new RoomService();
        this.userService = new UserService();
        this.bookingService = BookingService.getInstance();
    }

    public void bookRoom(String user, String roomType) {
        if (userService.isValidUser(user) && roomService.isAvailable(roomType)) {
            bookingService.book(roomType, user);
            System.out.println("Room booked successfully for " + user);
        } else {
            System.out.println("Booking failed.");
        }
    }

    public RoomService getRoomService() {
        return roomService;
    }
}
