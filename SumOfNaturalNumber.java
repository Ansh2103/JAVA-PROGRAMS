import java.util.Scanner;

public class SumOfNaturalNumber {
    public static void main(String[] args) {
        int sum = 0;
        System.out.println("Enter any number to get sum : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            sum = sum + i;

        }
        System.out.println("Sum of numbers : " + sum);
    }
}