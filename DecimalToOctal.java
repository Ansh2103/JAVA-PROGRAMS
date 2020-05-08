import java.util.Scanner;

public class DecimalToOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any no to convert : ");
        int decimal = sc.nextInt();
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
