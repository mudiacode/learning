import java.math.BigDecimal;

public class CreditCardPayment implements Payment {
    public void pay(BigDecimal amount) {
        System.out.println("Paid by credit card!");
    }
}
