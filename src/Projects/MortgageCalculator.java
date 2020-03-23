package Projects;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {
        int principal = 0;
        float interest_rate = 0.0F;
        short months = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Principal: ");
        principal = Integer.parseInt(input.next());

        System.out.print("Annual Interest Rate: ");
        interest_rate = (Float.parseFloat(input.next())/100)/12;

        System.out.print("Period (Years): ");
        months =  (short) (Short.parseShort(input.next()) * 12);

        double mortgage_nominator = interest_rate*(Math.pow(1+interest_rate,months));
        double mortgage_denominator = Math.pow(1+interest_rate,months)-1;
        double mortgage = principal*(mortgage_nominator/mortgage_denominator);


        System.out.println("Mortgage " + NumberFormat.getCurrencyInstance().format(mortgage));

    }
}
