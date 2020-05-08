import java.util.Scanner;

public class SpringSeason
{
    public static void main(String [] args)
    {
        System.out.print("enter the month : ");
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();

        System.out.print("enter the day : ");
        int day = sc.nextInt();

        boolean Spring = (month == 3 && day >= 20 && day <= 31)
                || (month == 4 && day >= 1 && day <= 30)
                || (month == 5 && day >= 1 && day <= 31)
                || (month == 6 && day >= 1 && day <= 20);


            System.out.println(Spring);
            sc.close();

    }
}

