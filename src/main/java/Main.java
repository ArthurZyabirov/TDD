public class Main {
    public static void main(String[] args) {
        CreditCalculator crCalc = new CreditCalculator(240000,6,11);
        System.out.println("Платеж за месяц составит: " + crCalc.paymentForMonth());
        System.out.println("Переплата состави:т " + crCalc.overPayment());
        System.out.println("Сумма всего кредита составит: " + crCalc.totalAmount());

    }
}
