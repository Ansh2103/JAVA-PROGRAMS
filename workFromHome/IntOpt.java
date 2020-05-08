import java.util.Scanner;

public class IntOpt
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("please,enter the values of a,b and c : ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        int firstOperation = a+b*c;
        int SecondOperation = c+a/b;
        int ThirdOperation = a%b+c;

        System.out.println("first Operation : "+firstOperation);
        System.out.println("Second Operation : "+SecondOperation);
        System.out.println("Third operation : "+ThirdOperation);

        System.out.println();
        sc.close();

    }
}
