import java.util.Scanner;
public class smallest_num_array
        {
        public static int smallest(int[] arr,int size)
        {
            int small=arr[0];
            for(int i=0;i<size;i++)
            {
                if(arr[i]<small)
                    small=arr[i];
            }
            return small;
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
            System.out.println("smallest number is : "+smallest(a,size));
        }
    }

