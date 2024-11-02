import main.BookingFacade;
import main.Customer;
import main.RoomFactory;

public class HotelBookingApp {
    public static void main(String[] args) {
        BookingFacade bookingFacade = new BookingFacade();
        RoomFactory roomFactory = new RoomFactory();

        // Создаем клиента и добавляем его как наблюдателя
        Customer customer1 = new Customer("Alice");
        bookingFacade.getRoomService().addObserver(customer1);

        // Бронирование номера
        bookingFacade.bookRoom("Alice", "Standard");

        // Изменение статуса комнаты
        bookingFacade.getRoomService().changeRoomStatus("Occupied");

        // Уведомление клиента
        System.out.println("Booking and notifications completed.");
    }
}
