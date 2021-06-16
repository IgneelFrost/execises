public class DaysInAYear 
{
    public static void main(String[] args) {
        for (int i = 2000; i <= 2020; i++)
            System.out.println("Year: " +i + " \nNumber of days: " +numberOfDaysInAYear(i));
    }
    public static int numberOfDaysInAYear(int year) {
        int days = 0;
        if (year % 4 == 0 && year % 100 != 0)
            days = 366;
        else 
            days = 365;
        return days;
    }
}