public class Pyramid_Star_Pattern5
{
    public static void main(String[] args)

    {
        int i,j,k=0,row=5;


        for (i=1;i<=row;i++)
        {


            for(j=1;j<=row-i;j++)
                System.out.print(" ");


            while(k!=(2*i-1))
            {
                System.out.print("*");
                k++;
            }
            k=0;
            System.out.println();
        }
    }
}
