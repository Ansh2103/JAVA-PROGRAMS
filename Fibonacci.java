import java.util.Scanner;

public class Fibonacci {
    public static void main(String[]args){
    int x=0, y=1, sum;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter nth no to get fibonacci series: ");
        int range = sc.nextInt();
        if(range > 0) {
            System.out.print("Fibonacci series :  "+x+" "+y+" ");

            while (y <= range) {
                sum = x + y;
                x = y;
                y = sum;
                if(sum <= range)
                    System.out.print(y+ " ");
            }
        }
        else{
            System.out.print("Invalid input");
        }

    }
}
