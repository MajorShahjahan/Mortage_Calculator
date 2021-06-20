

public class MortgageCalculator {

    public static void main(String[] args) {

        int principal = (int) ReadNumber.readNumber("Principal: ", 1000, 1_000_000);
        float annualInterest = (float) ReadNumber.readNumber("Annual Interest Rate: ", 1, 30);
        byte years = (byte) ReadNumber.readNumber("Period (Years): ", 1, 30);

        var calculate = new CalculateMortgage(principal, annualInterest, years);

        var  readNumber = new PrintOutput(calculate);
        readNumber.printMortgage();
        readNumber.printPaymentSchedule();

    }
}







