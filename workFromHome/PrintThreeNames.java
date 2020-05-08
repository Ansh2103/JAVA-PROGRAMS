import java.util.Scanner;

public class PrintThreeNames
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter first name : ");
        String n1 = sc.next();
        System.out.print("enter second name : ");
        String n2 = sc.next();
        System.out.print("enter third name : ");
        String n3 = sc.next();

        System.out.println("hi "+n3+" ,"+n2+" and "+n1+" ");


    }
}
