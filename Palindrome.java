import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        int reverse = 0, temp ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n = sc.nextInt();
        temp = n;
        while (n != 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n = n / 10;
        }
            if (temp == reverse)
                System.out.println(temp + " is a palindrome number");

            else
                System.out.println(temp + " is not a palindrome number");


    }
}