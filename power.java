import java.util.Scanner;

public class power
{
    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the base value : ");
        int base= sc.nextInt();
        System.out.println("enter the exponential value : ");
        int expo = sc.nextInt();

        int result=1;

        while(expo!= 0)
        {
            result = result* base;
            --expo;
        }
        System.out.println("answer : "+result);
        sc.close();

    }
}
