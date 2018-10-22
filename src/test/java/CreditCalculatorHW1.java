
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class CreditCalculatorHW1 {
    private final double CREDIT_AMOUNT = 4000;
    private final double CREDIT_TOTAL_AMOUNT_FROM_USER = 13600.01;

    @Test
    public void checkTotalAmount() {
        double creditTotalAmount = CREDIT_AMOUNT * 2 + CREDIT_AMOUNT * 0.8 + CREDIT_AMOUNT * 0.6;
        Assertions.assertEquals(CREDIT_TOTAL_AMOUNT_FROM_USER, creditTotalAmount, 0.009, "This is not true Amount!");
    }
}
