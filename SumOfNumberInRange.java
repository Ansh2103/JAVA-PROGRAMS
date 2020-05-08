import java.util.Scanner;

public class SumOfNumberInRange {
    public static void main(String[] args) {
        int a, i, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Number");
        a = sc.nextInt();
        System.out.println("Enter last number to get sum : ");
        int num = sc.nextInt();
       for(i=a; i<num; i++){
           sum=sum+i;
       }
        System.out.println("Sum of numbers : " + sum);
        }
}
