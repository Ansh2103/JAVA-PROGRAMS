import java.util.Scanner;

public class power_of_a_no
{
    public static void main(String args [] )
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number : ");
        int number =sc.nextInt();

        if(number>=0)
        {
            int fact=1;
            for(int i= number;i>=1;i--)
                fact=fact*i;
            System.out.println("the factorial of "+number+ " is :"+fact);
        }
        else
            System.out.println("wrong input");
    }
}
