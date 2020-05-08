public class InsertionSort
{
    public static void main(String[] args)
    {
            int[] a = {11, 8, 20, 10, 233, 74, 20, 89, 37, 43};
            for(int k=1; k<10; k++)
            {
                int temp = a[k];
                int j= k-1;
                while(j>=0 && temp <= a[j])
                {
                    a[j+1] = a[j];
                    j = j-1;
                }
                a[j+1] = temp;
            }
            System.out.println("THe Sorted Elements are : ");
            for(int i=0;i<10;i++)
            {
                System.out.println(a[i]);
            }
        }
    }
