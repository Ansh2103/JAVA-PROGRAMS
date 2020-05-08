import java.util.Scanner;

public class abundant
{
    public  static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter a number");
        int number = sc.nextInt();

        int sum=0;

        int i;
        for (i=1; i<number; i++)
        {
            if (number %i == 0)
                sum=sum+i;
        }
        if(sum>number)
            System.out.println("its an abundant number");
        else
            System.out.println("its not an abundant number");
        sc.close();
    }


}
