import java.util.Scanner;

public class Case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in)        ;
        System.out.print("Text: ");
        String userInput = sc.nextLine();
        System.out.println(userInput.toLowerCase());
        System.out.println(userInput.toUpperCase());
        sc.close();
    }
}
