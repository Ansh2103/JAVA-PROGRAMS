import java.util.Scanner;

public class PositiveNegativeNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num >= 0)
        {
            System.out.println("This is a Positive Number");
        }
        else{
            System.out.println("This is a Negative Number");

        }


    }
}