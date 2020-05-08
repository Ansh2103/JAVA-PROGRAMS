import java.util.*;
import java.util.Scanner;
public class Longest_Palindrome
    {
        public static boolean isPalindrome(int n)
        {
            int remainder,number,reverse=0;
            number=n;
            while(n!=0)
            {
                remainder=n%10;
                reverse=reverse*10+remainder;
                n=n/10;
            }
            if(number==reverse)
                return true;
            else
                return false;
        }

        public static int largest(int []arr, int n)
        {
            int i,j,temp;

            for(i=0;i<n;i++)
            {
                for(j=0;j<n;j++)
                {
                    if(arr[i]<arr[j])
                    {
                        temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
                }
            }
            for (i = n - 1; i >= 0; --i)
            {
                if (isPalindrome(arr[i]))
                    return arr[i];
            }
            return -1;
        }
        public static void main(String[] args)
        {
            int[] arr= new int[50];
            Scanner sc=new Scanner(System.in);
            System.out.println("enter size");
            int size=sc.nextInt();
            System.out.println("enter element");
            for(int i=0;i<size;i++)
            {
                arr[i]=sc.nextInt();
            }
            int larger=largest(arr, size);
            if(larger==-1)
                System.out.println("There is no palindrome number in the array");
            else
                System.out.println("Longest palindrome number in the array"+larger);
        }
    }
