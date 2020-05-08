import java.util.Scanner;

public class fibonacci_rev
{
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the limit : ");
        int lim = sc.nextInt();
            if(lim>0)
            {
                int x = 0, y = 1, s;
                System.out.print("fibonaccie series : " + x + " " + y + "   ");


                while (y <= lim) {
                    s = x + y;
                    x = y;
                    y = s;

                    if (y <= lim)
                        System.out.print(y+ " ");
                }
                }
            else
                System.out.println("wrong input");
    }


}
