import java.util.Scanner;

public class Quadratic
{
    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the value of a : ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b : ");
        int b = sc.nextInt();
        System.out.print("Enter the value of c : ");
        int c= sc.nextInt();

        double delta = b * b - 4 * a * c;
        if (delta > 0) {
            double sqroot = Math.sqrt(delta);
            double root1 = (- + sqroot) / (2.0 * a);
            double root2 = (-b - sqroot) / (2.0 * a);

            System.out.println("Root 1 of x = "+root1);
            System.out.println("Root 2 of x = "+root2);
        } else {
            System.out.println("Roots are imaginary");
        }
        sc.close();
    }
}
