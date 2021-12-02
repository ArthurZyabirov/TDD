import org.junit.Test;
import org.junit.jupiter.api.Assertions;


class CreditCalculatorTest {

        @Test
        void testPaymentForMonth(){

            int amount = 1000000 ;
            int countYears  = 5 ;
            int percent = 10;
            CreditCalculator cr = new CreditCalculator(amount,countYears,percent);
            double expected =  ;
            double result = cr.paymentForMonth;
            Assertions.assertEquals(expected,result);

        }
        @Test
        void testOverPayment(){
            int amount = 1000000 ;
            int countYears  = 5 ;
            int percent = 10;
            CreditCalculator cr = new CreditCalculator(amount, countYears, percent);

            double expected =  ;
            double result = cr.overPayment;

            Assertions.assertEquals(expected,result);



        }
        @Test
        void testTotalAmount(){
            int amount = 1000000 ;
            int countYears  = 5 ;
            int percent = 10;
            CreditCalculator cr = new CreditCalculator(amount, countYears, percent);
            double expected = ;
            double result = cr.totalAmount;
            Assertions.assertEquals(expected,result);



        }
    }


}