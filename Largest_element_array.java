import java.util.Scanner;

public class Largest_element_array

    {
        public static int largest(int[] arr,int size)
        {
            int large=arr[0];
            for(int i=0;i<size;i++)
            {
                if(arr[i]>large)
                    large=arr[i];
            }
            return large;
        }
        public static void main(String[] args)
        {
            int[] a = new int[50];
            Scanner sc=new Scanner(System.in);
            System.out.print("enter size : ");
            int size=sc.nextInt();
            System.out.println("enter Element : ");
            for(int i=0;i<size;i++)
                a[i]=sc.nextInt();
            System.out.println("largest: "+largest(a,size));
        }
    }

