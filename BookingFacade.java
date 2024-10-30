class BookingFacade {
    private RoomFactory roomFactory;
    private BookingService bookingService;
    private PriceContext priceContext;

    public BookingFacade() {
        roomFactory = new RoomFactory();
        bookingService = new BookingService();
        priceContext = new PriceContext();
    }

    public void addCustomerToNotifications(Observer customer) {
        bookingService.addObserver(customer);
    }

    public void bookRoom(String roomType, PricingStrategy strategy) {
        Room room = roomFactory.createRoom(roomType);
        priceContext.setStrategy(strategy);
        double finalPrice = priceContext.getFinalPrice(room);

        System.out.println("Booking a " + roomType + " room at $" + finalPrice);
        bookingService.bookRoom(room);
    }
}
