import java.util.Scanner;
public class Date {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Date: ");
        String date = sc.nextLine(); 
        String month = date.substring(0, 2);
        String day = date.substring(3, 5);
        String year = date.substring(6);
        switch (month) {
            case "01": month = "January"; break;
            case "02": month = "February"; break;
            case "03": month = "March"; break;
            case "04": month = "April"; break;
            case "05": month = "May"; break;
            case "06": month = "June"; break;
            case "07": month = "July"; break;
            case "08": month = "August"; break;
            case "09": month = "September"; break;
            case "10": month = "October"; break;
            case "11": month = "November"; break;
            case "12": month = "December";
        }
        System.out.println(month + " " + day + ", " + year);
        sc.close();
    }
}
