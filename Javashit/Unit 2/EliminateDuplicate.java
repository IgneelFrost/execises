import java.util.Scanner;
public class EliminateDuplicate
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] userInput = new int [10];
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < userInput.length; i++) {
            userInput[i] = sc.nextInt();
        }
        System.out.println("The distinct numbers are: " + eliminateDuplicates(userInput));
        sc.close();
    }
    public static int[] eliminateDuplicates(int[] list) {
        int result[] = {0};
        for (int i = 0; i < 10; i++) {
            int counter = 0;
            int n = list.length;
            for (int j = 0; j < n; j++) {
                if (list[j] == i) {
                    counter++;
                    n--;
                }
            }
            int[] distinct = new int[n];
            if (counter != 0) {
                for (int k = 0; k < n; k++)
                    distinct[k] = i;
            }
            result = distinct;
        }
        return result;
    }
}