import java.util.Scanner;

public class power_rev
{
    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the base number : ");
        int base= sc.nextInt();
        System.out.println("enter the exponential number : ");
        int expo = sc.nextInt();

        int result=1;

        for (int i=0; i<expo;expo--)
        {
            result=result*base;
        }
        System.out.println("answer : "+result);
        sc.close();
    }
}
