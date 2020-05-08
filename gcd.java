import javax.swing.*;
import java.util.Scanner;

public class gcd {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter First number : ");
        int num1=sc.nextInt();
        System.out.print("Enter second number : ");
        int num2=sc.nextInt();

        int n=1;

        if (num1!=num2)

            while (n!=0)
            {
                n=num1%num2;
                if (n!=0)
                {
                    num1=num2;
                    num2=n;
                }
                System.out.println("hcf is : "+num2);
            }
        else
            System.out.println("wrong input");
    }
}
