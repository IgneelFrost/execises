import java.util.Scanner;

public class Shit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Loan Amount: ");
        int loan = sc.nextInt();
        System.out.print("Number of Years: ");
        int years = sc.nextInt();

        System.out.println("Interest Rate    Monthly Payment    Total Payment");
        for (double i = 5; i <= 8; i+=0.25) {
            System.out.printf("%.3f%%", i);
            System.out.print("           ");
            double monthlyInterestRate = i / 1200;
			double monthlyPayment = loan * monthlyInterestRate / (1
				- 1 / Math.pow(1 + monthlyInterestRate, years * 12));
            System.out.printf("%.2f", monthlyPayment);
            System.out.print("             ");
            System.out.printf("%.2f\n",(monthlyPayment * 12) * years);
        }
        sc.close();
    }
}
