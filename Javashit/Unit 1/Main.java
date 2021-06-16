import java.util.Scanner;
public class Main {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the valor of n: ");
        int i = 1, lines = 1;
        int n  = sc.nextInt();
        int sum = n * (n + 1)/2;
        while (n >= i) {
            if (lines <= 20) { 
                System.out.printf("%6d", i);
                lines++;
            }
            else {
                System.out.println(" ");
                System.out.printf("%6d", i);
                lines = 2;
            }
            i++;
        }
     System.out.println("\n The sum of " + n +" natural number is " + sum);
     sc.close();
    }
}
