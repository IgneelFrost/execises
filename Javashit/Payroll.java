import java.util.Scanner;
public class Payroll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee's name: ");
        String name = sc.nextLine();
        System.out.print("Enter number of hours worked in a week: ");
        float hoursWorked = sc.nextFloat();
        System.out.print("Enter hourly pay rate: ");
        float hourlyPay = sc.nextFloat();
        System.out.print("Enter federal tax withholding rate: ");
        float fedTax = sc.nextFloat();
        System.out.print("Enter state tax withholding rate: ");
        float stateTax = sc.nextFloat();

        float grossPay = hoursWorked * hourlyPay;
        float fedWithhold = grossPay * fedTax;
        float stateWithhold = grossPay * stateTax;

        System.out.println(" ");
        System.out.print("Employee Name: "+ name);
        System.out.printf("\nHours Worked: %.1f\n", hoursWorked);
        System.out.printf("Pay Rate: $%.2f\n", hourlyPay);
        System.out.printf("Gross Pay: $%.1f\n", grossPay);
        System.out.print("Deductions:\n");
        System.out.printf("  Federal Withholding (%.1f%%): $%.1f\n", (fedTax * 100), fedWithhold);
        System.out.printf("  State Withholding (%.1f%%): $%.2f\n", (stateTax * 100), stateWithhold);
        System.out.printf("  Total Deduction: $%.2f\n", (fedWithhold + stateWithhold));
        System.out.printf("Net Pay: $%.2f", (grossPay - (fedWithhold + stateWithhold)));
    }
}
