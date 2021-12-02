import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.*;

public class CreditCalculatorTest {

    @Test
    public void testPaymentForMonth(){

        int amount = 1000000 ;
        int countYears  = 5 ;
        int percent = 10;
        CreditCalculator crCalc = new CreditCalculator(amount,countYears,percent);
        double expected = 25000;
        double result = crCalc.paymentForMonth();
        Assertions.assertEquals(expected,result);

    }
    @Test
    public void testOverPayment(){
        int amount = 1000000 ;
        int countYears  = 5 ;
        int percent = 10;
        CreditCalculator crCalc = new CreditCalculator(amount, countYears, percent);

        double expected = 500000;
        double result = crCalc.overPayment();

        Assertions.assertEquals(expected,result);



    }
    @Test
    public void testTotalAmount(){
        int amount = 1000000 ;
        int countYears  = 5 ;
        int percent = 10;
        CreditCalculator crCalc = new CreditCalculator(amount, countYears, percent);
        double expected = 1500000;
        double result = crCalc.totalAmount();
        Assertions.assertEquals(expected,result);



    }

}