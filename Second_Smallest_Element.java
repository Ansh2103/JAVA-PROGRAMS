import java.util.Scanner;
public class Second_Smallest_Element
    {
        public static int SecondSmallest(int a[],int size)
        {
            int temp=0;
            for(int i=0;i<size;i++)
            {
                for(int j=0;j<size;size++)
                {
                    if(a[i]>a[j])
                    {
                        temp=a[i];
                        a[i]=a[j];
                        a[j]=temp;
                    }
                }
            }
            return a[1];
        }
        public static void main(String[] args)
        {
            int j=0;
            int[] arr=new int[40];
            Scanner sc=new Scanner(System.in);
            System.out.println("enter size");
            int size=sc.nextInt();
            System.out.println("enter element");
            for(int i=0;i<size;i++)
                arr[i]=sc.nextInt();
            System.out.print("Second smallest number "+SecondSmallest(arr,size));
        }
    }
