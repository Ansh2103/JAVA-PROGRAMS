import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {

        int sum = 0,m, temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any three number: ");
        int n = sc.nextInt();
        temp = n;
        while (n > 0) {
            m = n % 10;
            sum = sum + (m*m*m);
            n = n / 10;

        }
        if(temp == sum){
            System.out.println(temp+" is an Armstrong Number");
        }
        else {
            System.out.println(temp +" is not an Armstrong Number");
        }
    }
}