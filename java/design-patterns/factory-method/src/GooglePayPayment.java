import java.math.BigDecimal;

public class GooglePayPayment implements Payment {
    public void pay(BigDecimal amount) {
        System.out.println("Paid by Google Pay!");
    }
}
