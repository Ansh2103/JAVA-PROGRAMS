import java.util.Scanner;

public class GreatestInThreeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of a :");
        int a = sc.nextInt();

        System.out.print("Enter value of b :");
        int b = sc.nextInt();

        System.out.print("Enter value of c :");
        int c = sc.nextInt();

        if( (a > b)&&(a > c)) {

            System.out.println(a + " is greater than "+ c + " and "+ b);
        } else if ((b > a)&&(b > c)) {
            System.out.println(b + " is greater than "+ c + " and "+ a);
        } else{
            System.out.println(c +" is greater than " + a +" and " + b);
        }
    }

}
