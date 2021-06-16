import java.util.Scanner; 
public class New{ 
public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in); 
    System.out.print("Enter an integer (max 10 values): ");
    int number, smallest;
	number = sc.nextInt();
    int lines = 1;
	smallest = number;
    do {
        System.out.print("Enter an integer: ");
        number = sc.nextInt();
        lines++;
		if (number < smallest)
			smallest = number;
    } while (lines < 10);
	System.out.println(+smallest + " is the smallest number");
    sc.close();
    }
}

