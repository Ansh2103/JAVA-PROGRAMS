import java.util.Scanner;

public class OctalToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Octal no : ");
        int octal = sc.nextInt();
        int decimal = 0;
        int p =0;

        while (octal>0)
        {
            int temp = octal%10;
            decimal += temp*Math.pow(8,p);
            octal = octal/10;
            p++;
        }
        System.out.println("the decimal number is"+decimal);
    }
}
