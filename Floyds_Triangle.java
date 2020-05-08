import java.util.Scanner;

public class Floyds_Triangle
{
    public static void main(String[] args)
    {

        int i,j,n,k=1;

        System.out.print("Enter number of row ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();

        for(i=1;i<=n;i++)
        {

            for(j=1;j<=i;j++)
            {
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }
    }
}
