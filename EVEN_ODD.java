import java.util.Scanner;

public class EVEN_ODD {
    public static void main(String[]args){
        int num;
        System.out.print("Enter a number");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        if(num % 10 == 0){
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number");
        }
    }
}
