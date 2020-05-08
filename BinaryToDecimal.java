import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary no : ");
        int binary = sc.nextInt();
        int decimal = 0;
        int p =0;

        while (binary>0)
        {
            int temp = binary%10;
            decimal += temp*Math.pow(2,p);
            binary = binary/10;
            p++;
        }
        System.out.println("the decimal number is"+decimal);



    }
}
