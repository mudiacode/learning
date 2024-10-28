import java.math.BigDecimal;

public class PayPalPayment implements Payment {
    public void pay(BigDecimal amount) {
        System.out.println("Paid by PayPal!");
    }
}
