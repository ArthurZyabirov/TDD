public class CreditCalculator {

    private int amount;
    private int years;
    private int percent;

    public CreditCalculator(int amount, int years, int percent) {
        this.amount = amount;
        this.years = years;
        this.percent = percent;
    }
    public double paymentForMonth() {
        return  ((amount / 100 * percent * years) + (amount)) / (years * 12);
    }
    public double overPayment() {
        return  amount / 100 * percent * years;
    }
    public double totalAmount() {
        return  (amount / 100 * percent * years)+amount;
    }
}
