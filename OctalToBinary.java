import java.util.Scanner;

public class OctalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Octal no: ");
        int octal = sc.nextInt();
        int p =0;
        int decimal= 0;
        while (octal > 0)
            {
                int temp1 = octal % 10;
                decimal += temp1 * Math.pow(8, p);
                octal = octal / 10;
                p++;
            }
            int[] binary = new int[20];
            int i = 0;
            while(decimal > 0){
                int r = decimal % 2;
                binary[i++] = r;
                decimal = decimal/2;
            }
            System.out.print("Binary  no is : ");
            for(int j=i-1; j>=0; j--)
                System.out.print(binary[j]+ "");
             sc.close();
    }
}
