public class Main {
    public static void main(String[] args) {
        BookingFacade bookingFacade = new BookingFacade();

        // Create customers
        Customer customer1 = new Customer("Alice");
        Customer customer2 = new Customer("Bob");

        // Add customers to notifications
        bookingFacade.addCustomerToNotifications(customer1);
        bookingFacade.addCustomerToNotifications(customer2);

        // Book rooms with different pricing strategies
        bookingFacade.bookRoom("Single", new RegularPriceStrategy());  // Regular Price
        bookingFacade.bookRoom("Double", new SeasonalDiscountStrategy());  // Seasonal Discount
    }
}
