import java.text.NumberFormat;

public class PrintOutput {

    private final NumberFormat currency;
    private CalculateMortgage calculate;

    public PrintOutput (CalculateMortgage calculate){
        this.calculate = calculate;
        currency = NumberFormat.getCurrencyInstance();
    }


    public void printPaymentSchedule() {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");
        for (double balance : calculate.getRemainingBalances())
            System.out.println(currency.format(balance));

    }

    public void printMortgage() {
        double mortgage = calculate.calculateMortgage();
        String mortgageFormatted = currency.format(mortgage);
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly Payments: " + mortgageFormatted);
    }
}
