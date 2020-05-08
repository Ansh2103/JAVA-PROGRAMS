import java.util.Scanner;

public class harshad_number
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number: ");
        int number=sc.nextInt();

        int n=number;

        int sum=0;

        while(n!=0)
        {
            int pick_last=n%10;
            sum=sum+pick_last;
            n=n/10;
        }
        if(number%sum==0)
            System.out.println("its a harshad number");
        else
            System.out.println("its not a harshad number");
        sc.close();
    }
}
