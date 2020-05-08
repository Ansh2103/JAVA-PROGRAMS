import java.util.Scanner;

public class DoubleOpt
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("please,enter the values of a,b and c : ");
        double a=sc.nextInt();
        double b=sc.nextInt();
        double c=sc.nextInt();

        double firstOperation = a+b*c;
        double SecondOperation = c+a/b;
        double ThirdOperation = a%b+c;

        System.out.println("first Operation : "+firstOperation);
        System.out.println("Second Operation : "+SecondOperation);
        System.out.println("Third operation : "+ThirdOperation);

    }
}
