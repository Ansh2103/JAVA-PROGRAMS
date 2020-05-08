import java.util.Scanner;

public class Pyramid_Number_Pattern3
{
    public static void main(String[] args)

    {

        int i,j,k=0,s,count=0,count1=0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the row");
        int row = sc.nextInt();

        for(i=1;i<=row;i++)
        {

            for(s=1;s<=row-i;s++)
            {
                System.out.print("  ");
                count++;
            }

            while(k!=2*i-1)
            {
                if(count<=row-1)
                {
                    System.out.print((k+i)+" ");
                    count++;
                }
                else
                {
                    count1++;
                    System.out.print((i+k-2*count1)+" ");
                }
                k++;
            }

            count1=count=k=0;
            System.out.println();
        }
    }
}
