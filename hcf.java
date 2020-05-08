import java.util.Scanner;

public class hcf {
    public static void  main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter first number : ");
        int num1=sc.nextInt();
        System.out.print("enter second number : ");
        int num2 =sc.nextInt();

        int n=1;
        System.out.print("hcf of"+num1+"and"+num2+"is : ");

        if(num1!=num2)

             while (n != 0)
                {
                     n = num1 % num2;
                     if (n != 0)
                {
                    num1 = num2;
                    num2 = n;
                }
                System.out.println(num2);
            }
        else
            System.out.println("wrong input");
            sc.close();
        }


    }

