public class BubbleSort
{
    public static void main(String[] args)
        {
            int[] a = {11, 8, 20, 10, 233, 74, 20, 89, 37, 43};
            for(int i=0;i<10;i++)
            {
                for (int j=0;j<10;j++)
                {
                    if(a[i]<a[j])
                    {
                        int temp = a[i];
                        a[i]=a[j];
                        a[j] = temp;
                    }
                }
            }
            System.out.println("The Sorted List Is : ");
            for(int i=0;i<10;i++)
            {
                System.out.println(a[i]);
            }
        }
    }

