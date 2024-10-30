public class PaymentService {
    public boolean processPayment(User user, double amount) {
        System.out.println("Processing payment of $" + amount + " for user " + user.getName());
        // Логика оплаты
        return true; // Возвращаем true, если оплата успешна
    }
}
