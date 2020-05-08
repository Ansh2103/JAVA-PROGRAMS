import java.util.Scanner;
public class SumOfSquare
    {
        public static int SquareKaSum(int a[],int size)
        {
            int sum=0;
            int square=0;

            for(int i=0;i<size;i++)
            {
                square=a[i]*a[i];
                sum=sum+square;
            }
            return sum;
        }

        public static void main(String[] args)
        {
            int j=0;
            int[] arr=new int[40];
            Scanner sc=new Scanner(System.in);
            System.out.print("enter the size : ");
            int size=sc.nextInt();
            System.out.println("enter the elements : ");
            for(int i=0;i<size;i++)
                arr[i]=sc.nextInt();
            System.out.print("sum of Positive Square  element : "+SquareKaSum(arr,size));
        }
    }
