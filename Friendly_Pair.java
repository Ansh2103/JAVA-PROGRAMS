import java.util.Scanner;

public class Friendly_Pair {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first no of pair : ");
        int num1 = sc.nextInt();
        System.out.print("Enter second no of the pair : ");
        int num2 = sc.nextInt();

        int sum = 0;
        int temp = 0;

        for (int i = 1; i < num1; i++) {
            if (num1 % i == 0)
                sum = sum + i;
        }
        for (int j = 1; j < num2; j++){
            if (num2 % j == 0)
                temp = temp + j;
        }
        if((sum == num2)&&(temp == num1))
            System.out.print(+num1+ "and " +num2+ "are friendly pair");
        else
            System.out.print(+num1+ "and " +num2+ "are not friendly pair");
    }
}
