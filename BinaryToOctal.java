import jdk.nashorn.internal.parser.JSONParser;

import java.util.Scanner;

public class BinaryToOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter binary no :");
        int binary = sc.nextInt();

        int decimal = 0;
        int p = 0;

        while (binary>0)
        {
            int temp = binary%10;
            decimal += temp*Math.pow(2,p);
            binary = binary/10;
            p++;
        }
        int octal [] = new int[20];
        int i =0 ;

        while(decimal > 0){
            int temp1 = decimal % 8;
            octal[i++]= temp1;
            decimal = decimal/8;
        }
        System.out.print("octal no is : ");
        for(int j = i ; j >= 0 ; j--)
            System.out.print(octal[j] +"");
            sc.close();
    }
}
