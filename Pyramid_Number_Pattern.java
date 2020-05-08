import java.util.Scanner;

public class Pyramid_Number_Pattern
{
    public static void main(String[] args)
    {

        int i,j;

        Scanner sc = new Scanner(System.in);

        System.out.print(" Enter the row");
        int row = sc.nextInt();

        for(i=1;i<=row;i++)
        {

            for(j=1;j<=i;j++)
                System.out.print(j+" ");
            System.out.println();
        }
    }
}
