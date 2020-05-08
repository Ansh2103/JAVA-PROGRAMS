public class Pyramid_Star_Pattern4
{
    public static void main(String[] args)
    {
        int i,j,k=16,m=1;

        for(i=0;i<5;i++)
        {

            for(j=0;j<k;j++)
                System.out.print(" ");

            k=k-4;

            for(j=1;j<=m;j++)
                System.out.print("* ");

            m=m+2;
            System.out.println();
        }
    }
}
