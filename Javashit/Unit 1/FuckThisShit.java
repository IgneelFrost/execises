import java.util.Scanner;

public class FuckThisShit {
    public static void main(String[] args) {
        Scanner yg69 = new Scanner(System.in);
        System.out.print("Input a deez between 0-7: ");
        int deez;
        deez = yg69.nextInt();
        String day = "";
        switch (deez) { 
            case 0:
                day = "Sunday.";
                break;
            case 1:
                day = "Monday.";
                break;
            case 2:
                day = "Tuesday.";
                break;
            case 3:
                day = "Wednesday.";
                break;
            case 4:
                day = "Thirsday.";
                break;
            case 5:
                day = "Friday.";
                break;
            case 6:
                day = "Saturday.";
        }
        System.out.println("The day is " + day);
        yg69.close();
    }
}
