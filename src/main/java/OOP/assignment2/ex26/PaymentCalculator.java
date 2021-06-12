package OOP.assignment2.ex26;

public class PaymentCalculator {
    public static void main(String[] args) {

    }
    public int calculateMonthsUntilPaidOff(double[] paymentInfo){
        double b = Math.ceil(paymentInfo[0]*100)/100;
        double i = paymentInfo[1]/36500.0;
        double p = paymentInfo[2];
        double n; //Number of months
        n = Math.ceil(-(1.0/30.0) * Math.log(1 + b/p * (1 - Math.pow((1 + i), 30) ) ) / Math.log(1 + i));
        return (int)n;
    }
}
