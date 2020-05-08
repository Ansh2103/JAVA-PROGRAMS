import java.util.Scanner;

public class perfect_no {
    public static void  main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number: ");
        int number=sc.nextInt();

        int sum=0;

        for (int i=1;i<number;i++)
        {
            if(number%i==0)
                sum=sum+i;
        }
        if (sum==number)
            System.out.println("the number is perfect number");
        else
            System.out.println("the number is not perfect");
        sc.close();

    }
}
