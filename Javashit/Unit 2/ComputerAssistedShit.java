import java.security.SecureRandom;
import java.util.Scanner;
public class ComputerAssistedShit {
    public static void main(String[] args) {
        questions();
    }
    public static int questions() {
        SecureRandom randomNumber = new SecureRandom();
        Scanner sc = new Scanner(System.in);
        int num1 = 1 + randomNumber.nextInt(9);
        int num2 = 1 + randomNumber.nextInt(9);
        System.out.print("How much is " + num1 +" times " + num2 +"? ");
        int answer = sc.nextInt();
        while (num1 * num2 != answer) {
            System.out.println("No. Please try again.");
            System.out.print("How much is " + num1 +" times " + num2 +"? ");
            answer = sc.nextInt();
        }
        System.out.println("Very good!");
        sc.close();
        return questions();
    }
}