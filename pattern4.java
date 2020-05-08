
import java.util.Scanner;

public class pattern4 {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("to find tha armstrong number,please enter any number of your choice : ");
        int num=sc.nextInt();
        int t1=num;
        int len =0;
        while(t1!=0)
        {
            len=len+1;
            t1=t1/10;
        }
        int t2=num;
        int arm=0;
        int rem;

        while(t2!=0)
        {
            int mul=1;
            rem=t2%10;
            for (int i=1;i<=len;i++)
            {
                mul=mul*rem;
            }
            arm=arm+mul;
            t2=t2/10;
        }
        if(arm==num)
            System.out.println("the number is armstrong number");
        else
            System.out.println("the number is not an armstrong number");
    }
}
